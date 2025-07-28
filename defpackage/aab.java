package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: aab  reason: default package */
public final class aab extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hab Y;
    public final /* synthetic */ Uri Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aab(hab hab, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = hab;
        this.Z = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        aab aab = new aab(this.Y, this.Z, continuation);
        aab.X = obj;
        return aab;
    }

    public final Object o(Object obj) {
        kcc kcc;
        Uri uri;
        kcc kcc2 = jue.a;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        k77[] k77Arr = hab.E0;
        hab hab = this.Y;
        t97 t97 = hab.Y;
        t97 t972 = hab.Z;
        File q = ((mg5) t97.getValue()).q((String) hab.D0.get());
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
            hab.t();
        }
        t97 t973 = hab.c;
        String absolutePath = q.getAbsolutePath();
        at7.I((xzc) t973.getValue(), absolutePath, absolutePath);
        at7.H((xzc) t973.getValue(), q.getAbsolutePath());
        Intent intent = new Intent((Application) t972.getValue(), ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(q));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", q.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        taf.o(hab.A0, new w8b(intent));
        return kcc2;
    }
}
