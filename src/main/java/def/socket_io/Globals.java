package def.socket_io;
/** This class holds all the global functions and variables of the def.socket_io package. */
public final class Globals {
    private Globals(){}
    @jsweet.lang.Module("socket.io")
    public static SocketIOStatic socket_io;
    /**
	 * Default Server constructor
	 */
    @jsweet.lang.Module("socket.io")
    native public static def.socket_io.socketio.Server socket_io();
    /**
	 * Creates a new Server
	 * @param srv The HTTP server that we're going to bind to
	 * @param opts An optional parameters object
	 */
    @jsweet.lang.Module("socket.io")
    native public static def.socket_io.socketio.Server socket_io(Object srv, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    @jsweet.lang.Module("socket.io")
    native public static def.socket_io.socketio.Server socket_io(java.lang.String port, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param A parameters object
	 */
    @jsweet.lang.Module("socket.io")
    native public static def.socket_io.socketio.Server socket_io(def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param srv The HTTP server that we're going to bind to
	 * @param opts An optional parameters object
	 */
    @jsweet.lang.Module("socket.io")
    native public static def.socket_io.socketio.Server socket_io(Object srv);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    @jsweet.lang.Module("socket.io")
    native public static def.socket_io.socketio.Server socket_io(java.lang.String port);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    @jsweet.lang.Module("socket.io")
    native public static def.socket_io.socketio.Server socket_io(double port, def.socket_io.socketio.ServerOptions opts);
    /**
	 * Creates a new Server
	 * @param port A port to bind to, as a number, or a string
	 * @param An optional parameters object
	 */
    @jsweet.lang.Module("socket.io")
    native public static def.socket_io.socketio.Server socket_io(double port);
}

