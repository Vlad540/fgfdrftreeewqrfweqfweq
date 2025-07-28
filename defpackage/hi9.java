package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: hi9  reason: default package */
public final class hi9 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ii9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hi9(ii9 ii9, Continuation continuation) {
        super(2, continuation);
        this.Z = ii9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hi9 hi9 = new hi9(this.Z, continuation);
        hi9.Y = obj;
        return hi9;
    }

    public final Object o(Object obj) {
        Intent intent;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            ii9 ii9 = this.Z;
            try {
                ii9.k = String.valueOf(System.currentTimeMillis());
                Uri fromFile = Uri.fromFile(((mg5) ii9.b.getValue()).q(ii9.k));
                String uri = fromFile.toString();
                int i2 = js.d;
                if (!uri.startsWith("content://")) {
                    fromFile = ((mg5) ii9.b.getValue()).f((Context) ii9.c.getValue(), gt0.N(fromFile));
                }
                intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", fromFile);
                intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            } catch (Throwable th) {
                intent = new kcc(th);
            }
            ii9 ii92 = this.Z;
            Throwable a = mcc.a(intent);
            if (a != null) {
                udd.s(ou3.getClass().getName(), "capturePhoto: failed to capture photo", a);
                ii92.a();
            }
            ii9 ii93 = this.Z;
            if (!(intent instanceof kcc)) {
                hcd hcd = ii93.g;
                cc0 cc0 = new cc0(intent);
                this.Y = intent;
                this.X = 1;
                if (hcd.a(cc0, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
