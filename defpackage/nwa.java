package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: nwa  reason: default package */
public final class nwa implements qk1 {
    public final t0c X;
    public final t97 Y;
    public final vp1 a;
    public final lwa b;
    public cf1 c;
    public final grd o;

    /* JADX WARNING: type inference failed for: r4v6, types: [i26, l5e] */
    public nwa(aka aka, so1 so1, vp1 vp1, lwa lwa, t97 t97) {
        vp1 vp12 = vp1;
        r7e d = z11.a.getAccessor().d(ro1.class);
        r7e d2 = bh1.a.getAccessor().d(po1.class);
        this.a = vp12;
        this.b = lwa;
        grd a2 = hrd.a(new bga((mc0) null, (String) null, (le1) null, false, false, true, (hze) null, ize.o, false, (CharSequence) null));
        this.o = a2;
        this.X = new t0c(a2);
        t97 O = ez3.O(3, new qga(17));
        this.Y = O;
        vp12.d(this);
        ez3.N(new ck5(((f5f) O.getValue()).d, new l5e(2, (Continuation) null), 5), (ou3) d.getValue());
        ez3.N(new v11(new v11(new u09(((po1) d2.getValue()).o, 20), ((oka) aka).A0, new wua(3, (Continuation) null, 2), 4), ((ep1) so1).I, new od1((Object) this, t97, (Continuation) null, 6), 4), (ou3) d.getValue());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        nwa.super.onDestroyed(conversationDestroyedInfo);
        this.b.b();
        this.c = null;
    }
}
