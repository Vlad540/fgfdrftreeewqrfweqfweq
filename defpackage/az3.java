package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.DataChannel;

/* renamed from: az3  reason: default package */
public final class az3 {
    public final DataChannel a;
    public final xwb b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public az3(DataChannel dataChannel, xwb xwb) {
        this.a = dataChannel;
        this.b = xwb;
        dataChannel.registerObserver(new nu7((Object) this, (Object) dataChannel, false));
    }

    public final void a(nhc nhc) {
        if (nhc != null) {
            this.d.add(nhc);
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }

    public final boolean b() {
        return this.a.state() == DataChannel.State.OPEN;
    }

    public final void c(nhc nhc) {
        if (nhc != null) {
            this.d.remove(nhc);
            return;
        }
        throw new IllegalArgumentException("Illegal 'listener' value: null");
    }

    public final void d(ByteBuffer... byteBufferArr) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((nhc) it.next()).getClass();
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new Exception(th));
            }
        }
        this.a.sendMultiple(true, byteBufferArr);
    }

    public final boolean e(int i, byte[] bArr) {
        if (bArr != null) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ((nhc) it.next()).getClass();
                    ByteBuffer.wrap(bArr);
                } catch (Throwable th) {
                    this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new Exception(th));
                }
            }
            return this.a.send(new DataChannel.Buffer(ByteBuffer.wrap(bArr), i == 2));
        }
        throw new IllegalArgumentException("Illegal 'command' value: null");
    }
}
