package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: eqd  reason: default package */
public final class eqd extends l5e implements i26 {
    public final /* synthetic */ a X;
    public final /* synthetic */ Uri Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eqd(a aVar, Uri uri, String str, Continuation continuation) {
        super(2, continuation);
        this.X = aVar;
        this.Y = uri;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new eqd(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = ActAvatarCrop.h1;
        a aVar = this.X;
        if (aVar.c0() != null) {
            Intent intent = new Intent(aVar.c0(), ActAvatarCrop.class);
            intent.putExtra("ru.ok.tamtam.extra.URI", this.Y);
            intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", this.Z);
            intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", false);
            intent.addFlags(65536);
            intent.putExtra("ru.ok.tamtam.extra.NO_ANIM ", true);
            intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", true);
            aVar.e1(intent, 666, (Bundle) null);
        }
        return jue.a;
    }
}
