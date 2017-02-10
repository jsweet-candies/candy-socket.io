package def.socket_io.socketio;
import def.js.Function;
/**
	 * The socket, which handles our connection for a namespace. NOTE: while
	 * we technically extend NodeJS.EventEmitter, we're not putting it here
	 * as we have a problem with the emit() event (as it's overridden with a
	 * different return)
	 */
@jsweet.lang.Interface
public abstract class Socket extends def.js.Object {
    /**
		 * The namespace that this socket is for
		 */
    public Namespace nsp;
    /**
		 * The Server that our namespace is in
		 */
    public Server server;
    /**
		 * The Adapter that we use to handle our rooms
		 */
    public Adapter adapter;
    /**
		 * The unique ID for this Socket. Regenerated at every connection. This is
		 * also the name of the room that the Socket automatically joins on connection
		 */
    public String id;
    /**
		 * The http.IncomingMessage request sent with the connection. Useful
		 * for recovering headers etc
		 */
    public Object request;
    /**
		 * The Client associated with this Socket
		 */
    public Client client;
    /**
		 * The underlying Engine.io Socket instance
		 */
    public Conn conn;
    /**
		 * The list of rooms that this Socket is currently in, where
		 * the ID the the room ID
		 */
    public Rooms rooms;
    /**
		 * Is the Socket currently connected?
		 */
    public Boolean connected;
    /**
		 * Is the Socket currently disconnected?
		 */
    public Boolean disconnected;
    /**
		 * The object used when negociating the handshake
		 */
    public Handshake handshake;
    /**
		 * Sets the 'json' flag when emitting an event
		 */
    public Socket json;
    /**
		 * Sets the 'volatile' flag when emitting an event. Volatile messages are
		 * messages that can be dropped because of network issues and the like. Use
		 * for high-volume/real-time messages where you don't need to receive *all*
		 * of them
		 */
    @jsweet.lang.Name("volatile")
    public Socket Volatile;
    /**
		 * Sets the 'broadcast' flag when emitting an event. Broadcasting an event
		 * will send it to all the other sockets in the namespace except for yourself
		 */
    public Socket broadcast;
    /**
		 * Emits an event to this client. If the 'broadcast' flag was set, this will
		 * emit to all other clients, except for this one
		 * @param event The event that we want to emit
		 * @param args Any number of optional arguments to pass with the event. If the
		 * last argument is a function, it will be called as an ack. The ack should
		 * take whatever data was sent with the packet
		 * @return This Socket
		 */
    native public Socket emit(String event, Object... args);
    /**
		 * Targets a room when broadcasting
		 * @param room The name of the room that we're targeting
		 * @return This Socket
		 */
    native public Socket to(String room);
    /**
		 * @see to( room )
		 */
    native public Socket in(String room);
    /**
		 * Sends a 'message' event
		 * @see emit( event, ...args )
		 */
    native public Socket send(Object... args);
    /**
		 * @see send( ...args )
		 */
    native public Socket write(Object... args);
    /**
		 * Joins a room. You can join multiple rooms, and by default, on connection,
		 * you join a room with the same name as your ID
		 * @param name The name of the room that we want to join
		 * @param fn An optional callback to call when we've joined the room. It should
		 * take an optional parameter, err, of a possible error
		 * @return This Socket
		 */
    native public Socket join(String name, java.util.function.Consumer<Object> fn);
    /**
		 * Leaves a room
		 * @param name The name of the room to leave
		 * @param fn An optional callback to call when we've left the room. It should
		 * take on optional parameter, err, of a possible error
		 */
    native public Socket leave(String name, Function fn);
    /**
		 * Leaves all the rooms that we've joined
		 */
    native public void leaveAll();
    /**
		 * Disconnects this Socket
		 * @param close If true, also closes the underlying connection
		 * @return This Socket
		 */
    native public Socket disconnect(Boolean close);
    /**
		 * Adds a listener for a particular event. Calling multiple times will add
		 * multiple listeners
		 * @param event The event that we're listening for
		 * @param fn The function to call when we get the event. Parameters depend on the
		 * event in question
		 * @return This Socket
		 */
    native public Socket on(String event, Function fn);
    /**
		 * @see on( event, fn )
		 */
    native public Socket addListener(String event, Function fn);
    /**
		 * Adds a listener for a particular event that will be invoked
		 * a single time before being automatically removed
		 * @param event The event that we're listening for
		 * @param fn The function to call when we get the event. Parameters depend on
		 * the event in question
		 * @return This Socket
		 */
    native public Socket once(String event, Function fn);
    /**
		 * Removes a listener for a particular type of event. This will either
		 * remove a specific listener, or all listeners for this type of event
		 * @param event The event that we want to remove the listener of
		 * @param fn The function to remove, or null if we want to remove all functions
		 * @return This Socket
		 */
    native public Socket removeListener(String event, Function fn);
    /**
		 * Removes all event listeners on this object
		 * @return This Socket
		 */
    native public Socket removeAllListeners(String event);
    /**
		 * Sets the maximum number of listeners this instance can have
		 * @param n The max number of listeners we can add to this emitter
		 * @return This Socket
		 */
    native public Socket setMaxListeners(double n);
    /**
		 * Returns all the callbacks for a particular event
		 * @param event The event that we're looking for the callbacks of
		 * @return An array of callback Functions, or an empty array if we don't have any
		 */
    native public Function[] listeners(String event);
    /**
		 * Sets the compress flag
		 * @param compress If `true`, compresses the sending data
		 * @return This Socket
		 */
    native public Socket compress(Boolean compress);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Conn extends def.js.Object {
        /**
			 * The ID for this socket - matches Client.id
			 */
        public String id;
        /**
			 * The Engine.io Server for this socket
			 */
        public Object server;
        /**
			 * The ready state for the client. Either 'opening', 'open', 'closing', or 'closed'
			 */
        public String readyState;
        /**
			 * The remote IP for this connection
			 */
        public String remoteAddress;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Rooms extends def.js.Object {
        native public java.lang.String $get(String id);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Handshake extends def.js.Object {
        /**
			 * The headers passed along with the request. e.g. 'host',
			 * 'connection', 'accept', 'referer', 'cookie'
			 */
        public Object headers;
        /**
			 * The current time, as a string
			 */
        public String time;
        /**
			 * The remote address of the connection request
			 */
        public String address;
        /**
			 * Is this a cross-domain request?
			 */
        public Boolean xdomain;
        /**
			 * Is this a secure request?
			 */
        public Boolean secure;
        /**
			 * The timestamp for when this was issued
			 */
        public double issued;
        /**
			 * The request url
			 */
        public String url;
        /**
			 * Any query string parameters in the request url
			 */
        public Object query;
    }
    /**
		 * Joins a room. You can join multiple rooms, and by default, on connection,
		 * you join a room with the same name as your ID
		 * @param name The name of the room that we want to join
		 * @param fn An optional callback to call when we've joined the room. It should
		 * take an optional parameter, err, of a possible error
		 * @return This Socket
		 */
    native public Socket join(String name);
    /**
		 * Leaves a room
		 * @param name The name of the room to leave
		 * @param fn An optional callback to call when we've left the room. It should
		 * take on optional parameter, err, of a possible error
		 */
    native public Socket leave(String name);
    /**
		 * Disconnects this Socket
		 * @param close If true, also closes the underlying connection
		 * @return This Socket
		 */
    native public Socket disconnect();
    /**
		 * Removes a listener for a particular type of event. This will either
		 * remove a specific listener, or all listeners for this type of event
		 * @param event The event that we want to remove the listener of
		 * @param fn The function to remove, or null if we want to remove all functions
		 * @return This Socket
		 */
    native public Socket removeListener(String event);
    /**
		 * Removes all event listeners on this object
		 * @return This Socket
		 */
    native public Socket removeAllListeners();
    /**
		 * Joins a room. You can join multiple rooms, and by default, on connection,
		 * you join a room with the same name as your ID
		 * @param name The name of the room that we want to join
		 * @param fn An optional callback to call when we've joined the room. It should
		 * take an optional parameter, err, of a possible error
		 * @return This Socket
		 */
    native public Socket join(String name, java.lang.Runnable fn);
}

