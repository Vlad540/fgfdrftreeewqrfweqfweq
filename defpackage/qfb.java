package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: qfb  reason: default package */
public final class qfb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fgb Y;
    public final /* synthetic */ Uri Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qfb(fgb fgb, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = fgb;
        this.Z = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        qfb qfb = new qfb(this.Y, this.Z, continuation);
        qfb.X = obj;
        return qfb;
    }

    public final Object o(Object obj) {
        kcc kcc;
        Uri uri;
        kcc kcc2 = jue.a;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        k77[] k77Arr = fgb.X0;
        fgb fgb = this.Y;
        t97 t97 = fgb.A0;
        Context context = fgb.V0;
        File q = ((mg5) t97.getValue()).q((String) fgb.U0.get());
        try {
            if (!q.exists() && (uri = this.Z) != null) {
                ete.E(context.getContentResolver().openInputStream(uri), q);
            }
            kcc = kcc2;
        } catch (Throwable th) {
            kcc = new kcc(th);
        }
        Throwable a = mcc.a(kcc);
        if (a != null) {
            udd.s(ou3.getClass().getName(), "failed to copy picked image, e:", a);
            fgb.D();
        }
        t97 t972 = fgb.z0;
        String absolutePath = q.getAbsolutePath();
        at7.I((xzc) t972.getValue(), absolutePath, absolutePath);
        at7.H((xzc) t972.getValue(), q.getAbsolutePath());
        Intent intent = new Intent(context, ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(q));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", q.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        taf.o(fgb.F0, new qdb(intent));
        return kcc2;
    }
}
