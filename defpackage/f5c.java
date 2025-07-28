package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* renamed from: f5c  reason: default package */
public final class f5c extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ Object w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f5c(p46 p46, ewc ewc, Continuation continuation) {
        super(3, continuation);
        this.X = 3;
        this.Z = p46;
        this.w0 = ewc;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                f5c f5c = new f5c((Object) (h5c) this.w0, (Continuation) obj3, 0);
                f5c.Y = (bka) obj;
                f5c.Z = (eoc) obj2;
                return f5c.o(jue.a);
            case 1:
                f5c f5c2 = new f5c((Object) (xsc) this.w0, (Continuation) obj3, 1);
                f5c2.Y = (TextView) obj;
                f5c2.Z = (pda) obj2;
                jue jue = jue.a;
                f5c2.o(jue);
                return jue;
            case 2:
                f5c f5c3 = new f5c((Object) (xbb) this.w0, (Continuation) obj3, 2);
                f5c3.Y = (TextView) obj;
                f5c3.Z = (pda) obj2;
                jue jue2 = jue.a;
                f5c3.o(jue2);
                return jue2;
            case 3:
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
                f5c f5c4 = new f5c((p46) this.Z, (ewc) this.w0, (Continuation) obj3);
                f5c4.Y = (pda) obj2;
                jue jue3 = jue.a;
                f5c4.o(jue3);
                return jue3;
            case 4:
                f5c f5c5 = new f5c((Object) (fkd) this.w0, (Continuation) obj3, 4);
                f5c5.Y = (i22) obj;
                f5c5.Z = (tf3) obj2;
                return f5c5.o(jue.a);
            case 5:
                f5c f5c6 = new f5c((Object) (StartConversationScreen) this.w0, (Continuation) obj3, 5);
                f5c6.Y = (bk3) obj;
                f5c6.Z = (List) obj2;
                jue jue4 = jue.a;
                f5c6.o(jue4);
                return jue4;
            default:
                f5c f5c7 = new f5c((Object) (jea) this.w0, (Continuation) obj3, 6);
                f5c7.Y = (ImageView) obj;
                f5c7.Z = (pda) obj2;
                jue jue5 = jue.a;
                f5c7.o(jue5);
                return jue5;
        }
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [mr5, ig7] */
    public final Object o(Object obj) {
        int i;
        CharSequence l0;
        jue jue = jue.a;
        Object obj2 = this.w0;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                bka bka = (bka) this.Y;
                eoc eoc = (eoc) this.Z;
                qja qja = bka.a;
                ConversationFeatureManager g = ((py0) ((vx0) ((h5c) obj2).Z.getValue())).g();
                return au7.d(eoc, qja, bka.c, true ^ ((g != null ? g.getFeatureRoles(e51.b) : null) instanceof FeatureRoles.EnabledForAll));
            case 1:
                wx3.H(obj);
                ((TextView) this.Y).setTextColor(((Number) ((xsc) obj2).b.invoke((pda) this.Z)).intValue());
                return jue;
            case 2:
                wx3.H(obj);
                ((TextView) this.Y).setTextColor(((Number) ((xbb) obj2).b.invoke((pda) this.Z)).intValue());
                return jue;
            case 3:
                wx3.H(obj);
                pda pda = (pda) this.Y;
                if (((p46) this.Z).c) {
                    pda.getText();
                    i = -16745729;
                } else {
                    i = pda.getText().g;
                }
                ((ewc) obj2).L0.setTextColor(i);
                return jue;
            case 4:
                wx3.H(obj);
                i22 i22 = (i22) this.Y;
                tf3 tf3 = (tf3) this.Z;
                sg5 M = myc.M(new es(2, i22.i()), new u1c(9));
                fkd fkd = (fkd) obj2;
                fkd.getClass();
                List U = myc.U(myc.L(M, new lxc(fkd, 3, i22)));
                if (!i22.b0()) {
                    return U;
                }
                lg7 c = hwf.c();
                c.add(tf3);
                c.addAll(U);
                return hwf.a(c);
            case 5:
                wx3.H(obj);
                bk3 bk3 = (bk3) this.Y;
                List list = (List) this.Z;
                k77[] k77Arr = StartConversationScreen.L0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj2;
                CharSequence l02 = startConversationScreen.l0();
                if (!(true ^ (l02 == null || l02.length() == 0))) {
                    startConversationScreen.D0.E(bk3.a);
                    hw4 hw4 = hw4.a;
                    startConversationScreen.E0.E(hw4);
                    startConversationScreen.F0.E(bk3.c);
                    cpf cpf = startConversationScreen.G0;
                    if (cpf.j() == 0 && ((l0 = startConversationScreen.l0()) == null || l0.length() == 0)) {
                        cpf.E(ete.t());
                    }
                    bk3 bk32 = bk3.d;
                    ? r2 = startConversationScreen.C0;
                    if (bk3 == bk32) {
                        r2.E(hw4);
                    } else {
                        r2.E(list);
                    }
                }
                return jue;
            default:
                wx3.H(obj);
                ((ImageView) this.Y).setColorFilter(((pda) this.Z).i(((jea) obj2).d));
                return jue;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f5c(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.X = i;
        this.w0 = obj;
    }
}
