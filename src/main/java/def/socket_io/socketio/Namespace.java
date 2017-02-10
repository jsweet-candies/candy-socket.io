package def.socket_io.socketio;
import def.js.Function;
/**
	 * The Namespace, sandboxed environments for sockets, each connection
	 * to a Namespace requires a new Socket
	 */
@jsweet.lang.Interface
public abstract class Namespace extends def.js.Object {
    /**
		 * The name of the NameSpace
		 */
    public String name;
    /**
		 * The controller Server for this Namespace
		 */
    public Server server;
    /**
		 * A dictionary of all the Sockets connected to this Namespace, where
		 * the Socket ID is the key
		 */
    public Sockets sockets;
    /**
		 * A dictionary of all the Sockets connected to this Namespace, where
		 * the Socket ID is the key
		 */
    public Connected connected;
    /**
		 * The Adapter that we're using to handle dealing with rooms etc
		 */
    public Adapter adapter;
    /**
		 * Sets the 'json' flag when emitting an event
		 */
    public Namespace json;
    /**
		 * Registers a middleware function, which is a function that gets executed
		 * for every incoming Socket
		 * @param fn The function to call when we get a new incoming socket. It should
		 * take one parameter of type Socket, and one callback function to call to
		 * execute the next middleware function. The callback can take one optional
		 * parameter, err, if there was an error. Errors passed to middleware callbacks
		 * are sent as special 'error' packets to clients
		 * @return This Namespace
		 */
    native public Namespace use(java.util.function.BiConsumer<Socket,java.util.function.Consumer<Object>> fn);
    /**
		 * Targets a room when emitting
		 * @param room The name of the room that we're targeting
		 * @return This Namespace
		 */
    native public Namespace to(String room);
    /**
		 * @see to( room )
		 */
    native public Namespace in(String room);
    /**
		 * Sends a 'message' event
		 * @see emit( event, ...args )
		 * @return This Namespace
		 */
    native public Namespace send(Object... args);
    /**
		 * @see send( ...args )
		 */
    native public Namespace write(Object... args);
    /**
		 * The event fired when we get a new connection
		 * @param event The event being fired: 'connection'
		 * @param listener A listener that should take one parameter of type Socket
		 * @return This Namespace
		 */
    native public Namespace on(def.socket_io.StringTypes.connection event, java.util.function.Consumer<Socket> listener);
    /**
		 * @see on( 'connection', listener )
		 */
    native public Namespace on(def.socket_io.StringTypes.connect event, java.util.function.Consumer<Socket> listener);
    /**
		 * Base 'on' method to add a listener for an event
		 * @param event The event that we want to add a listener for
		 * @param listener The callback to call when we get the event. The parameters
		 * for the callback depend on the event
		 * @ This Namespace
		 */
    native public Namespace on(String event, Function listener);
    /**
		 * Gets a list of clients.
		 * @return This Namespace
		 */
    native public Namespace clients(Function fn);
    /**
		 * Sets the compress flag.
		 * @param compress If `true`, compresses the sending data
		 * @return This Namespace
		 */
    native public Namespace compress(Boolean compress);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Sockets extends def.js.Object {
        native public Socket $get(String id);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Connected extends def.js.Object {
        native public Socket $get(String id);
    }
}

