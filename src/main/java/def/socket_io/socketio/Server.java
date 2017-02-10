package def.socket_io.socketio;
import def.js.Function;
@jsweet.lang.Interface
public abstract class Server extends def.js.Object {
    public Engine engine;
    /**
		 * A dictionary of all the namespaces currently on this Server
		 */
    public Nsps nsps;
    /**
		 * The default '/' Namespace
		 */
    public Namespace sockets;
    /**
		 * Sets the 'json' flag when emitting an event
		 */
    public Server json;
    /**
		 * Server request verification function, that checks for allowed origins
		 * @param req The http.IncomingMessage request
		 * @param fn The callback to be called. It should take one parameter, err,
		 * which will be null if there was no problem, and one parameter, success,
		 * of type boolean
		 */
    native public void checkRequest(Object req, java.util.function.BiConsumer<Object,Boolean> fn);
    /**
		 * Gets whether we're serving the client.js file or not
		 * @default true
		 */
    native public Boolean serveClient();
    /**
		 * Sets whether we're serving the client.js file or not
		 * @param v True if we want to serve the file, false otherwise
		 * @default true
		 * @return This Server
		 */
    native public Server serveClient(Boolean v);
    /**
		 * Gets the client serving path
		 * @default '/socket.io'
		 */
    native public String path();
    /**
		 * Sets the client serving path
		 * @param v The path to serve the client file on
		 * @default '/socket.io'
		 * @return This Server
		 */
    native public Server path(String v);
    /**
		 * Gets the adapter that we're going to use for handling rooms
		 * @default typeof Adapter
		 */
    native public Object adapter();
    /**
		 * Sets the adapter (class) that we're going to use for handling rooms
		 * @param v The class for the adapter to create
		 * @default typeof Adapter
		 * @return This Server
		 */
    native public Server adapter(Object v);
    /**
		 * Gets the allowed origins for requests
		 * @default "*:*"
		 */
    native public String origins();
    /**
		 * Sets the allowed origins for requests
		 * @param v The allowed origins, in host:port form
		 * @default "*:*"
		 * return This Server
		 */
    native public Server origins(String v);
    /**
		 * Attaches socket.io to a server
		 * @param srv The http.Server that we want to attach to
		 * @param opts An optional parameters object
		 * @return This Server
		 */
    native public Server attach(Object srv, ServerOptions opts);
    /**
		 * Attaches socket.io to a port
		 * @param port The port that we want to attach to
		 * @param opts An optional parameters object
		 * @return This Server
		 */
    native public Server attach(double port, ServerOptions opts);
    /**
		 * @see attach( srv, opts )
		 */
    native public Server listen(Object srv, ServerOptions opts);
    /**
		 * @see attach( port, opts )
		 */
    native public Server listen(double port, ServerOptions opts);
    /**
		 * Binds socket.io to an engine.io intsance
		 * @param src The Engine.io (or compatible) server to bind to
		 * @return This Server
		 */
    native public Server bind(Object srv);
    /**
		 * Called with each incoming connection
		 * @param socket The Engine.io Socket
		 * @return This Server
		 */
    native public Server onconnection(Object socket);
    /**
		 * Looks up/creates a Namespace
		 * @param nsp The name of the NameSpace to look up/create. Should start
		 * with a '/'
		 * @return The Namespace
		 */
    native public Namespace of(String nsp);
    /**
		 * Closes the server connection
		 */
    native public void close();
    /**
		 * The event fired when we get a new connection
		 * @param event The event being fired: 'connection'
		 * @param listener A listener that should take one parameter of type Socket
		 * @return The default '/' Namespace
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
		 * @return The default '/' Namespace
		 */
    native public Namespace on(String event, Function listener);
    /**
		 * Targets a room when emitting to the default '/' Namespace
		 * @param room The name of the room that we're targeting
		 * @return The default '/' Namespace
		 */
    native public Namespace to(String room);
    /**
		 * @see to( room )
		 */
    native public Namespace in(String room);
    /**
		 * Registers a middleware function, which is a function that gets executed
		 * for every incoming Socket, on the default '/' Namespace
		 * @param fn The function to call when we get a new incoming socket. It should
		 * take one parameter of type Socket, and one callback function to call to
		 * execute the next middleware function. The callback can take one optional
		 * parameter, err, if there was an error. Errors passed to middleware callbacks
		 * are sent as special 'error' packets to clients
		 * @return The default '/' Namespace
		 */
    native public Namespace use(java.util.function.BiConsumer<Socket,java.util.function.Consumer<Object>> fn);
    /**
		 * Emits an event to the default Namespace
		 * @param event The event that we want to emit
		 * @param args Any number of optional arguments to pass with the event. If the
		 * last argument is a function, it will be called as an ack. The ack should
		 * take whatever data was sent with the packet
		 * @return The default '/' Namespace
		 */
    native public Namespace emit(String event, Object... args);
    /**
		 * Sends a 'message' event
		 * @see emit( event, ...args )
		 * @return The default '/' Namespace
		 */
    native public Namespace send(Object... args);
    /**
		 * @see send( ...args )
		 */
    native public Namespace write(Object... args);
    /**
		 * Gets a list of clients
		 * @return The default '/' Namespace
		 */
    native public Namespace clients(Object... args);
    /**
		 * Sets the compress flag
		 * @return The default '/' Namespace
		 */
    native public Namespace compress(Object... args);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Engine extends def.js.Object {
        public Object ws;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Nsps extends def.js.Object {
        native public Namespace $get(String namespace);
    }
    /**
		 * Attaches socket.io to a server
		 * @param srv The http.Server that we want to attach to
		 * @param opts An optional parameters object
		 * @return This Server
		 */
    native public Server attach(Object srv);
    /**
		 * Attaches socket.io to a port
		 * @param port The port that we want to attach to
		 * @param opts An optional parameters object
		 * @return This Server
		 */
    native public Server attach(double port);
    /**
		 * @see attach( srv, opts )
		 */
    native public Server listen(Object srv);
    /**
		 * @see attach( port, opts )
		 */
    native public Server listen(double port);
}

