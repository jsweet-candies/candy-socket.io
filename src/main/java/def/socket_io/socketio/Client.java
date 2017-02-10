package def.socket_io.socketio;
/**
	 * The client behind each socket (can have multiple sockets)
	 */
@jsweet.lang.Interface
public abstract class Client extends def.js.Object {
    /**
		 * The Server that this client belongs to
		 */
    public Server server;
    /**
		 * The underlying Engine.io Socket instance
		 */
    public Conn conn;
    /**
		 * The ID for this client. Regenerated at every connection
		 */
    public String id;
    /**
		 * The http.IncomingMessage request sent with the connection. Useful
		 * for recovering headers etc
		 */
    public Object request;
    /**
		 * The dictionary of sockets currently connect via this client (i.e. to different
		 * namespaces) where the Socket ID is the key
		 */
    public Sockets sockets;
    /**
		 * A dictionary of all the namespaces for this client, with the Socket that
		 * deals with that namespace
		 */
    public Nsps nsps;
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
    public static class Sockets extends def.js.Object {
        native public Socket $get(String id);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Nsps extends def.js.Object {
        native public Socket $get(String nsp);
    }
}

