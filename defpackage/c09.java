package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: c09  reason: default package */
public final /* synthetic */ class c09 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ MessagesListWidget c;

    public /* synthetic */ c09(Bundle bundle, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = bundle;
        this.c = messagesListWidget;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, kd8] */
    public final Object invoke() {
        jk9 jk9;
        MessagesListWidget messagesListWidget = this.c;
        Bundle bundle = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MessagesListWidget.b1;
                long j = bundle.getLong("ARG_CHAT_ID");
                long j2 = bundle.getLong("ARG_LOAD_MARK");
                long j3 = bundle.getLong("ARG_LOAD_MESSAGE_ID");
                Object obj = bundle.get("ARG_HIGHLIGHTS");
                List list = obj instanceof List ? (List) obj : null;
                if (list == null) {
                    list = hw4.a;
                }
                f19 f19 = r5;
                MessagesListWidget messagesListWidget2 = messagesListWidget;
                long j4 = j;
                f19 f192 = new f19(j, j2, j3, list, bundle.getBoolean("ARG_HIGHLIGHT_MESSAGE"), bundle.getBoolean("ARG_SKIP_UNREAD_DECOR"));
                xv8 xv8 = xv8.a;
                vw8 vw8 = (vw8) xv8.getAccessor().c(vw8.class);
                md4 md4 = md4.REGULAR;
                vw8.getClass();
                int ordinal = md4.ordinal();
                if (ordinal == 0) {
                    jk9 = kk9.x0;
                } else if (ordinal == 1) {
                    jk9 = jk9.x0;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                jk9 jk92 = jk9;
                w4 w4Var = vw8.a;
                Context context = (Context) w4Var.c(Context.class);
                pae pae = (pae) w4Var.c(pae.class);
                Class<bv2> cls = bv2.class;
                t97 d = w4Var.d(cls);
                t97 d2 = w4Var.d(b29.class);
                t97 d3 = w4Var.d(n1b.class);
                t97 d4 = w4Var.d(l3a.class);
                t97 d5 = w4Var.d(ap3.class);
                ? obj2 = new Object();
                obj2.o = j4;
                obj2.a = md4;
                obj2.b = jk92;
                t97 t97 = d5;
                obj2.c = new r7e(new zu4((Object) d, 21, (Object) obj2));
                obj2.X = new r7e(new k61(d, d2, obj2, 4));
                kh6 kh6 = new kh6(us8.i(j4, "MessagesListLoader#"));
                pg6 pg6 = obj2;
                r7e r7e = new r7e(new va2(context, w4Var, 3));
                r7e r7e2 = new r7e(new va2(context, w4Var, 2));
                Class<aqc> cls2 = aqc.class;
                xv8 xv82 = xv8;
                MessagesListWidget messagesListWidget3 = messagesListWidget2;
                t97 t972 = t97;
                r7e r7e3 = r7e;
                kh6 kh62 = kh6;
                pg6 pg62 = pg6;
                t97 t973 = d2;
                Class<bv2> cls3 = cls;
                t97 d6 = w4Var.d(g15.class);
                r7e r7e4 = r7e3;
                pae pae2 = pae;
                t97 t974 = t972;
                w4 w4Var2 = w4Var;
                md4 md42 = md4;
                mw mwVar = new mw(j4, pae, md4, jk92, d, d6, d4, t973, w4Var.d(n86.class), (aqc) w4Var.c(cls2));
                t97 t975 = d;
                tw twVar = new tw(j4, md42, (sce) w4Var2.c(sce.class), new nfc(20, t975), (l92) w4Var2.c(l92.class), (r59) w4Var2.c(r59.class), mwVar, (aqc) w4Var2.c(cls2));
                ew8 ew8 = new ew8(j4, (tt0) w4Var2.c(tt0.class), pae2);
                r7e r7e5 = r7e4;
                r7e r7e6 = r7e2;
                d3a d3a = new d3a(r7e5, r7e6, d3, t974);
                r7e r7e7 = r7e5;
                pae pae3 = pae2;
                return new zz8(f19, (we1) messagesListWidget3.z0.getValue(), new fw(t975, t973, d4, w4Var2.d(s76.class), j4, pae3, kh62, ew8, r7e7, r7e6, (ku3) w4Var2.c(ku3.class), d3a, pg62, mwVar, twVar, (ua3) w4Var2.c(ua3.class), 40, 15), new mu7(xv82.getAccessor().d(m0c.class), xv82.getAccessor().d(cls3), new rw6((to8) xv82.getAccessor().c(to8.class)), xv82.getAccessor().d(p7a.class), j4));
            default:
                k77[] k77Arr2 = MessagesListWidget.b1;
                return (k0c) messagesListWidget.createViewModelLazy(k0c.class, new js5(26, new i11(bundle.getLong("ARG_CHAT_ID"), 4))).getValue();
        }
    }
}
