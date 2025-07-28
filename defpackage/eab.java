package defpackage;

import android.app.Application;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: eab  reason: default package */
public final class eab extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hab Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eab(hab hab, Continuation continuation) {
        super(2, continuation);
        this.Y = hab;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        eab eab = new eab(this.Y, continuation);
        eab.X = obj;
        return eab;
    }

    public final Object o(Object obj) {
        Intent intent;
        hab hab = this.Y;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        try {
            AtomicReference atomicReference = hab.D0;
            t97 t97 = hab.Y;
            atomicReference.set(String.valueOf(System.currentTimeMillis()));
            Uri fromFile = Uri.fromFile(((mg5) t97.getValue()).q((String) hab.D0.get()));
            String uri = fromFile.toString();
            int i = js.d;
            if (!uri.startsWith("content://")) {
                fromFile = ((mg5) t97.getValue()).f((Application) hab.Z.getValue(), gt0.N(fromFile));
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
            hab.s();
        }
        if (!(intent instanceof kcc)) {
            taf.o(hab.A0, new b9b(intent));
        }
        return jue.a;
    }
}
