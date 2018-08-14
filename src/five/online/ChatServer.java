package five.online;

import five.online.network.ServerSocketThread;

public class ChatServer {

    private ServerSocketThread server;

    void start(int port) {
        if (server != null && server.isAlive()) {
            System.out.println("Server is already running");
        } else {
            server = new ServerSocketThread("Chat server", port);
        }
    }

    void stop() {
        if (server == null || !server.isAlive()) {
            System.out.println("Server is not running");
        } else {
            server.interrupt();
        }
    }
}
