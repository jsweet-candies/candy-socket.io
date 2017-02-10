package def.socket_io;
@jsweet.lang.Interface
public abstract class SocketIOStatic extends def.js.Object {
    /**
	 * Default Server constructor
	 */
    native public def.socket_io.socketio.Server apply();
    /**
	 * Creates a new Server
	 * @param srv The HTTP server that we're going to bind to
	 * @param opts An optional parameters object
	 */
    native public def.socket_io.socketio.Server apply(Object srv, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    native public def.socket_io.socketio.Server apply(String port, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param A parameters object
	 */
    native public def.socket_io.socketio.Server apply(def.socket_io.socketio.ServerOptions opts);
    /**
	 * Backwards compatibility
	 * @see io().listen()
	 */
    public SocketIOStatic listen;
    /**
	 * Creates a new Server
	 * @param srv The HTTP server that we're going to bind to
	 * @param opts An optional parameters object
	 */
    native public def.socket_io.socketio.Server apply(Object srv);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    native public def.socket_io.socketio.Server apply(String port);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    native public def.socket_io.socketio.Server apply(double port, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    native public def.socket_io.socketio.Server apply(double port);
    /**
	 * Default Server constructor
	 */
    native public def.socket_io.socketio.Server listen();
    /**
	 * Creates a new Server
	 * @param srv The HTTP server that we're going to bind to
	 * @param opts An optional parameters object
	 */
    native public def.socket_io.socketio.Server listen(Object srv, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    native public def.socket_io.socketio.Server listen(java.lang.String port, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param A parameters object
	 */
    native public def.socket_io.socketio.Server listen(def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param srv The HTTP server that we're going to bind to
	 * @param opts An optional parameters object
	 */
    native public def.socket_io.socketio.Server listen(Object srv);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    native public def.socket_io.socketio.Server listen(java.lang.String port);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    native public def.socket_io.socketio.Server listen(double port, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    native public def.socket_io.socketio.Server listen(double port);
}

