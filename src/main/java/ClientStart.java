import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;

public class ClientStart {
    public static void main(String args) throws Exception{
        try {
            NettyClient nettyClient = new NettyClient(12000);
            ChannelFuture channelFuture = nettyClient.connectLoop();
            while (true) {
                Thread.sleep(5000);
                if (channelFuture.isSuccess()) {
                    channelFuture.channel().writeAndFlush(Unpooled.wrappedBuffer("Hello\r\n".getBytes()));
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Try Starting Server First !!");
        }
        finally {
        }
    }
}
