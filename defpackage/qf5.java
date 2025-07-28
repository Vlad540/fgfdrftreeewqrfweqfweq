package defpackage;

import android.net.Uri;
import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* renamed from: qf5  reason: default package */
public final /* synthetic */ class qf5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag5 b;

    public /* synthetic */ qf5(ag5 ag5, int i) {
        this.a = i;
        this.b = ag5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ag5 ag5 = this.b;
                URI uri = ag5.h;
                String str = ag5.a == 1 ? "application/octet-stream" : "application/x-binary; charset=x-user-defined";
                StringBuilder sb = new StringBuilder("POST ");
                sb.append(uri.getRawPath());
                sb.append('?');
                sb.append(uri.getRawQuery());
                sb.append(" HTTP/1.1\nHost: ");
                sb.append(uri.getHost());
                sb.append("\nContent-Type: ");
                sb.append(str);
                sb.append(10);
                File file = ag5.i;
                String str2 = ag5.b;
                String name = ag5.a == 5 ? (str2 == null || str2.length() == 0) ? file.getName() : Uri.encode(str2) : (str2 == null || str2.length() == 0) ? String.valueOf(file.getName().hashCode()) : Uri.encode(str2);
                sb.append("Content-Disposition: attachment; filename=" + name + "\n");
                sb.append("X-Uploading-Mode: parallel\nConnection: keep-alive\nUser-Agent: ");
                String l = me4.l(sb, (String) ag5.c.e.getValue(), 10);
                if (ag5.u) {
                    String str3 = ag5.d;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.X, str3, "Prepared sharedHeaders: ".concat(l), (Throwable) null);
                    }
                }
                byte[] bytes = l.getBytes(e22.a);
                ByteBuffer put = ((xr0) ag5.g.getValue()).a(bytes.length).put(bytes);
                put.flip();
                return put;
            default:
                ag5 ag52 = this.b;
                return AsynchronousFileChannel.open(Paths.get(ag52.i.getPath(), new String[0]), Collections.singleton(StandardOpenOption.READ), (ExecutorService) ag52.e.getValue(), new FileAttribute[0]);
        }
    }
}
