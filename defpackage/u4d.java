package defpackage;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: u4d  reason: default package */
public final class u4d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ v4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u4d(v4d v4d, Continuation continuation) {
        super(2, continuation);
        this.Y = v4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        u4d u4d = new u4d(this.Y, continuation);
        u4d.X = obj;
        return u4d;
    }

    public final Object o(Object obj) {
        Intent intent;
        v4d v4d = this.Y;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        try {
            AtomicReference atomicReference = v4d.H0;
            t97 t97 = v4d.w0;
            atomicReference.set(String.valueOf(System.currentTimeMillis()));
            Uri fromFile = Uri.fromFile(((mg5) t97.getValue()).q((String) v4d.H0.get()));
            String uri = fromFile.toString();
            int i = js.d;
            if (!uri.startsWith("content://")) {
                fromFile = ((mg5) t97.getValue()).f((Application) v4d.x0.getValue(), gt0.N(fromFile));
            }
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", fromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        } catch (Throwable th) {
            intent = new kcc(th);
        }
        Throwable a = mcc.a(intent);
        if (a != null) {
            udd.s(ou3.getClass().getName(), "capturePhoto: failed to capture photo", a);
            v4d.v();
        }
        if (!(intent instanceof kcc)) {
            taf.o(v4d.B0, new r8d(intent));
        }
        return jue.a;
    }
}
