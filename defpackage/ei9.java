package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: ei9  reason: default package */
public final class ei9 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ii9 Z;
    public final /* synthetic */ Uri w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ei9(ii9 ii9, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Z = ii9;
        this.w0 = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ei9 ei9 = new ei9(this.Z, this.w0, continuation);
        ei9.Y = obj;
        return ei9;
    }

    public final Object o(Object obj) {
        kcc kcc;
        pu3 pu3 = pu3.a;
        int i = this.X;
        kcc kcc2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou3 = (ou3) this.Y;
            File q = ((mg5) this.Z.b.getValue()).q(this.Z.k);
            Uri uri = this.w0;
            ii9 ii9 = this.Z;
            try {
                if (!q.exists() && uri != null) {
                    ete.E(((Context) ii9.c.getValue()).getContentResolver().openInputStream(uri), q);
                }
                kcc = kcc2;
            } catch (Throwable th) {
                kcc = new kcc(th);
            }
            ii9 ii92 = this.Z;
            Throwable a = mcc.a(kcc);
            if (a != null) {
                udd.s(ou3.getClass().getName(), "failed to copy picked image, e:", a);
                ii92.b();
            }
            String absolutePath = q.getAbsolutePath();
            at7.I((xzc) this.Z.d.getValue(), absolutePath, absolutePath);
            at7.H((xzc) this.Z.d.getValue(), q.getAbsolutePath());
            Intent intent = new Intent((Context) this.Z.c.getValue(), ActAvatarCrop.class);
            intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(q));
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", q.getAbsolutePath());
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
            hcd hcd = this.Z.g;
            dc0 dc0 = new dc0(intent);
            this.X = 1;
            if (hcd.a(dc0, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return kcc2;
    }
}
