package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: jlf  reason: default package */
public final class jlf extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ WebAppRootScreen Z;
    public final /* synthetic */ hnf w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jlf(String str, WebAppRootScreen webAppRootScreen, hnf hnf, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = webAppRootScreen;
        this.w0 = hnf;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jlf jlf = new jlf(this.Y, this.Z, this.w0, continuation);
        jlf.X = obj;
        return jlf;
    }

    public final Object o(Object obj) {
        jue jue;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        WebAppRootScreen webAppRootScreen = this.Z;
        String str = this.Y;
        if (str == null) {
            Context context = webAppRootScreen.getContext();
            vqc vqc = (vqc) ((xzc) uif.a.getAccessor().c(xzc.class));
            String string = vqc.g.getString("invite-long", (String) null);
            str = string != null ? string : String.format(context.getString(whc.C), Arrays.copyOf(new Object[]{vqc.q(PmsKey.f47invitelink, "https://max.ru")}, 1));
        }
        jue jue2 = jue.a;
        hnf hnf = this.w0;
        if (hnf == null) {
            try {
                String str2 = oyb.g;
                oyb.R(webAppRootScreen.getContext(), str);
            } catch (Throwable th) {
                jue = new kcc(th);
            }
        } else {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            WebAppRootScreen.w0(webAppRootScreen, intent, hnf);
            String str3 = oyb.g;
            Intent D = oyb.D(webAppRootScreen.getContext(), intent);
            if (D != null) {
                intent = D;
            }
            webAppRootScreen.getContext().startActivity(intent);
        }
        jue = jue2;
        if (!(jue instanceof kcc)) {
            jue jue3 = jue;
            k77[] k77Arr = WebAppRootScreen.K0;
            webAppRootScreen.z0().evaluateJavascript("window.navigator.__share__receive()", new tea(1));
        }
        Throwable a = mcc.a(jue);
        if (a != null) {
            ou3.getClass();
            a.toString();
            k77[] k77Arr2 = WebAppRootScreen.K0;
            webAppRootScreen.z0().evaluateJavascript("window.navigator.__share__receive(abort)", new tea(1));
        }
        return jue2;
    }
}
