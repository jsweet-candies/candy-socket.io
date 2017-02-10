package def.socket_io.socketio;
/**
	 * The interface used when dealing with rooms etc
	 */
@jsweet.lang.Interface
public abstract class Adapter extends def.js.Object {
    /**
		 * The namespace that this adapter is for
		 */
    public Namespace nsp;
    /**
		 * A dictionary of all the rooms that we have in this namespace
		 * The rooms are made of a `sockets` key which is the dictionary of sockets per ID
		 */
    public Rooms rooms;
    /**
		 * A dictionary of all the socket ids that we're dealing with, and all
		 * the rooms that the socket is currently in
		 */
    public Sids sids;
    /**
		 * Adds a socket to a room. If the room doesn't exist, it's created
		 * @param id The ID of the socket to add
		 * @param room The name of the room to add the socket to
		 * @param callback An optional callback to call when the socket has been
		 * added. It should take an optional parameter, error, if there was a problem
		 */
    native public void add(String id, String room, java.util.function.Consumer<Object> callback);
    /**
		 * Removes a socket from a room. If there are no more sockets in the room,
		 * the room is deleted
		 * @param id The ID of the socket that we're removing
		 * @param room The name of the room to remove the socket from
		 * @param callback An optional callback to call when the socket has been
		 * removed. It should take on optional parameter, error, if there was a problem
		 */
    native public void del(String id, String room, java.util.function.Consumer<Object> callback);
    /**
		 * Removes a socket from all the rooms that it's joined
		 * @param id The ID of the socket that we're removing
		 */
    native public void delAll(String id);
    /**
		 * Broadcasts a packet
		 * @param packet The packet to broadcast
		 * @param opts Any options to send along:
		 * 	- rooms: An optional list of rooms to broadcast to. If empty, the packet is broadcast to all sockets
		 * 	- except: A list of Socket IDs to exclude
		 * 	- flags: Any flags that we want to send along ('json', 'volatile', 'broadcast')
		 */
    native public void broadcast(Object packet, Opts opts);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Rooms extends def.js.Object {
        native public $get $get(String room);
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class $get extends def.js.Object {
            public Sockets sockets;
            public double length;
            /** This is an automatically generated object type (see the source definition). */
            @jsweet.lang.ObjectType
            public static class Sockets extends def.js.Object {
                native public java.lang.Boolean $get(String id);
            }
        }
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Sids extends def.js.Object {
        native public $get $get(String id);
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class $get extends def.js.Object {
            native public java.lang.Boolean $get(String room);
        }
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Opts extends def.js.Object {
        @jsweet.lang.Optional
        public String[] rooms;
        @jsweet.lang.Optional
        public String[] except;
        @jsweet.lang.Optional
        public Flags flags;
        /** This is an automatically generated object type (see the source definition). */
        @jsweet.lang.ObjectType
        public static class Flags extends def.js.Object {
            native public java.lang.Boolean $get(String flag);
        }
    }
    /**
		 * Adds a socket to a room. If the room doesn't exist, it's created
		 * @param id The ID of the socket to add
		 * @param room The name of the room to add the socket to
		 * @param callback An optional callback to call when the socket has been
		 * added. It should take an optional parameter, error, if there was a problem
		 */
    native public void add(String id, String room);
    /**
		 * Removes a socket from a room. If there are no more sockets in the room,
		 * the room is deleted
		 * @param id The ID of the socket that we're removing
		 * @param room The name of the room to remove the socket from
		 * @param callback An optional callback to call when the socket has been
		 * removed. It should take on optional parameter, error, if there was a problem
		 */
    native public void del(String id, String room);
    /**
		 * Adds a socket to a room. If the room doesn't exist, it's created
		 * @param id The ID of the socket to add
		 * @param room The name of the room to add the socket to
		 * @param callback An optional callback to call when the socket has been
		 * added. It should take an optional parameter, error, if there was a problem
		 */
    native public void add(String id, String room, java.lang.Runnable callback);
    /**
		 * Removes a socket from a room. If there are no more sockets in the room,
		 * the room is deleted
		 * @param id The ID of the socket that we're removing
		 * @param room The name of the room to remove the socket from
		 * @param callback An optional callback to call when the socket has been
		 * removed. It should take on optional parameter, error, if there was a problem
		 */
    native public void del(String id, String room, java.lang.Runnable callback);
}

