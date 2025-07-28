package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: o4d  reason: default package */
public final class o4d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ v4d Y;
    public final /* synthetic */ Uri Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o4d(v4d v4d, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = v4d;
        this.Z = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o4d o4d = new o4d(this.Y, this.Z, continuation);
        o4d.X = obj;
        return o4d;
    }

    public final Object o(Object obj) {
        kcc kcc;
        Uri uri;
        kcc kcc2 = jue.a;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        k77[] k77Arr = v4d.K0;
        v4d v4d = this.Y;
        t97 t97 = v4d.w0;
        t97 t972 = v4d.x0;
        File q = ((mg5) t97.getValue()).q((String) v4d.H0.get());
        try {
            if (!q.exists() && (uri = this.Z) != null) {
                ete.E(((Application) t972.getValue()).getContentResolver().openInputStream(uri), q);
            }
            kcc = kcc2;
        } catch (Throwable th) {
            kcc = new kcc(th);
        }
        Throwable a = mcc.a(kcc);
        if (a != null) {
            udd.s(ou3.getClass().getName(), "failed to copy picked image, e:", a);
            v4d.w();
        }
        yzc yzc = ((j2b) v4d.s()).b;
        String absolutePath = q.getAbsolutePath();
        at7.I(yzc, absolutePath, absolutePath);
        at7.H(((j2b) v4d.s()).b, q.getAbsolutePath());
        Intent intent = new Intent((Application) t972.getValue(), ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(q));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", q.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        taf.o(v4d.B0, new o8d(intent));
        return kcc2;
    }
}
