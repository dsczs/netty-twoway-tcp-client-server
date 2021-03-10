public class ServerStart {
    public static void main(String args) throws Exception{
        ServerFlow.OpenServerPort(12000).channel().closeFuture().sync();
    }
}
