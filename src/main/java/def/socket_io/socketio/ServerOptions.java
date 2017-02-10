package def.socket_io.socketio;
/**
	 * Options to pass to our server when creating it
	 */
@jsweet.lang.Interface
public abstract class ServerOptions extends def.js.Object {
    /**
		 * The path to server the client file to
		 * @default '/socket.io'
		 */
    @jsweet.lang.Optional
    public String path;
    /**
		 * Should we serve the client file?
		 * @default true
		 */
    @jsweet.lang.Optional
    public Boolean serveClient;
    /**
		 * The adapter to use for handling rooms. NOTE: this should be a class,
		 * not an object
		 * @default typeof Adapter
		 */
    @jsweet.lang.Optional
    public Adapter adapter;
    /**
		 * Accepted origins
		 * @default '*:*'
		 */
    @jsweet.lang.Optional
    public String origins;
    /**
		 * How many milliseconds without a pong packed to consider the connection closed (engine.io)
		 * @default 60000
		 */
    @jsweet.lang.Optional
    public double pingTimeout;
    /**
		 * How many milliseconds before sending a new ping packet (keep-alive) (engine.io)
		 * @default 25000
		 */
    @jsweet.lang.Optional
    public double pingInterval;
    /**
		 * How many bytes or characters a message can be when polling, before closing the session
		 * (to avoid Dos) (engine.io)
		 * @default 10E7
		 */
    @jsweet.lang.Optional
    public double maxHttpBufferSize;
    /**
		 * A function that receives a given handshake or upgrade request as its first parameter,
		 * and can decide whether to continue or not. The second argument is a function that needs
		 * to be called with the decided information: fn( err, success ), where success is a boolean
		 * value where false means that the request is rejected, and err is an error code (engine.io)
		 * @default null
		 */
    @jsweet.lang.Optional
    public java.util.function.BiConsumer<Object,java.util.function.BiConsumer<Double,Boolean>> allowRequest;
    /**
		 * Transports to allow connections to (engine.io)
		 * @default ['polling','websocket']
		 */
    @jsweet.lang.Optional
    public String[] transports;
    /**
		 * Whether to allow transport upgrades (engine.io)
		 * @default true
		 */
    @jsweet.lang.Optional
    public Boolean allowUpgrades;
    /**
		 * parameters of the WebSocket permessage-deflate extension (see ws module).
		 * Set to false to disable (engine.io)
		 * @default true
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Object,Boolean> perMessageDeflate;
    /**
		 * Parameters of the http compression for the polling transports (see zlib).
		 * Set to false to disable, or set an object with parameter "threshold:number"
		 * to only compress data if the byte size is above this value (1024) (engine.io)
		 * @default true|1024
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<Object,Boolean> httpCompression;
    /**
		 * Name of the HTTP cookie that contains the client sid to send as part of
		 * handshake response headers. Set to false to not send one (engine.io)
		 * @default "io"
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Boolean> cookie;
}

