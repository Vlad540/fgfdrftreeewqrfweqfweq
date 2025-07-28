package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: bgb  reason: default package */
public final class bgb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bgb(fgb fgb, Continuation continuation) {
        super(2, continuation);
        this.Y = fgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bgb bgb = new bgb(this.Y, continuation);
        bgb.X = obj;
        return bgb;
    }

    public final Object o(Object obj) {
        Intent intent;
        fgb fgb = this.Y;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        try {
            AtomicReference atomicReference = fgb.U0;
            t97 t97 = fgb.A0;
            Uri fromFile = Uri.fromFile(((mg5) t97.getValue()).q((String) atomicReference.updateAndGet(new pb2(7))));
            String uri = fromFile.toString();
            int i = js.d;
            if (!uri.startsWith("content://")) {
                fromFile = ((mg5) t97.getValue()).f(fgb.V0, gt0.N(fromFile));
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
            fgb.z();
        }
        if (!(intent instanceof kcc)) {
            taf.o(fgb.E0, new veb(intent));
        }
        return jue.a;
    }
}
