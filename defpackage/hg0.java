package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ContactAvatarsScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: hg0  reason: default package */
public final class hg0 extends qbf {
    public final /* synthetic */ int a;
    public final Object b;

    public hg0() {
        this.a = 5;
        this.b = new ArrayList(3);
    }

    public void a(int i) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((qbf) it.next()).a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 8:
                ((mu7) this.b).b(false);
                return;
            default:
                return;
        }
    }

    public void b(int i, float f, int i2) {
        switch (this.a) {
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((qbf) it.next()).b(i, f, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            default:
                return;
        }
    }

    public final void c(int i) {
        int i2;
        View[] viewArr;
        View[] viewArr2;
        switch (this.a) {
            case 0:
                ig0 ig0 = (ig0) this.b;
                un3 un3 = (un3) ig0.K0.o.f.get(i);
                int R = xs7.R(un3.a);
                switch (hr1.t(un3.a)) {
                    case 0:
                        i2 = 3;
                        break;
                    case 1:
                    case 4:
                    case 6:
                        i2 = 1;
                        break;
                    case 2:
                    case 3:
                    case 5:
                        i2 = 2;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                int i3 = ig0.K0.j() == 1 ? 2 : 1;
                gg0 gg0 = ig0.J0;
                Integer d = ((xg9) gg0.c.getValue()).d();
                if (d != null) {
                    int intValue = d.intValue();
                    long D = ((f03) gg0.a.getValue()).D();
                    int t = hr1.t(i3) + us8.h(i2, ((hr1.t(R) * 961) + intValue) * 31, 31);
                    int t2 = hr1.t(R);
                    long j = -1;
                    if (t2 == 0) {
                        sb9 sb9 = gg0.e;
                        int b2 = sb9.b(t);
                        if (b2 >= 0) {
                            j = sb9.c[b2];
                        }
                        if (j != D) {
                            sb9.d(t, D);
                        } else {
                            return;
                        }
                    } else if (t2 == 1) {
                        sb9 sb92 = gg0.d;
                        int b3 = sb92.b(t);
                        if (b3 >= 0) {
                            j = sb92.c[b3];
                        }
                        if (j != D) {
                            sb92.d(t, D);
                        } else {
                            return;
                        }
                    } else if (t2 == 2) {
                        sb9 sb93 = gg0.f;
                        int b4 = sb93.b(t);
                        if (b4 >= 0) {
                            j = sb93.c[b4];
                        }
                        if (j != D) {
                            sb93.d(t, D);
                        } else {
                            return;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    gg0.b("showed", D, R, intValue, i2, i3);
                    return;
                }
                return;
            case 1:
                r51.w((r51) this.b, i);
                return;
            case 2:
                ChatMediaTabWidget chatMediaTabWidget = (ChatMediaTabWidget) this.b;
                xg9.g((xg9) chatMediaTabWidget.c.getValue(), ChatMediaTabWidget.l0(chatMediaTabWidget));
                return;
            case 3:
                k77[] k77Arr = ChatMediaViewerScreen.O0;
                ah2 B0 = ((ChatMediaViewerScreen) this.b).B0();
                B0.e1.o1(B0, ah2.h1[1], xs7.D(B0.a, B0.x0.a(), ru3.b, new ig2(B0, i, (Continuation) null)));
                return;
            case 4:
                k77[] k77Arr2 = ChatsTabWidget.F0;
                if (((Number) ((ChatsTabWidget) this.b).o0().z0.a.getValue()).intValue() != i) {
                    String str = ((ChatsTabWidget) this.b).b;
                    fn6 fn6 = udd.e;
                    if (fn6 != null && fn6.c()) {
                        fn6.d(tn7.X, str, wn6.h(i, "ONEME-6453|chats_list_lf | tabs page selected, pos:"), (Throwable) null);
                    }
                    eja q0 = ((ChatsTabWidget) this.b).q0();
                    ((xg9) ((ChatsTabWidget) this.b).z0.getValue()).f(mnc.A0, new eja(q0.a, 3, q0.c, q0.d));
                    ((ChatsTabWidget) this.b).p0(i);
                }
                ((ChatsTabWidget) this.b).o0().y0.m((Object) null, Integer.valueOf(i));
                return;
            case 5:
                try {
                    Iterator it = ((ArrayList) this.b).iterator();
                    while (it.hasNext()) {
                        ((qbf) it.next()).c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 6:
                ContactAvatarsScreen.t0((ContactAvatarsScreen) this.b, i);
                return;
            case 7:
                lx3 lx3 = (lx3) this.b;
                sgc sgc = (sgc) lx3.w0.get(i);
                int i4 = lx3.x0;
                if (i != i4) {
                    sgc sgc2 = (sgc) lx3.w0.get(i4);
                    if (sgc2 != null) {
                        Iterator it2 = sgc2.e().iterator();
                        while (it2.hasNext()) {
                            ((vgc) it2.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (sgc != null) {
                        Iterator it3 = sgc.e().iterator();
                        while (it3.hasNext()) {
                            ((vgc) it3.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    lx3.x0 = i;
                    return;
                }
                return;
            case 8:
                ((mu7) this.b).b(false);
                return;
            case 9:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                l87 l87 = (l87) o23.Y(i, mediaKeyboardWidget.A0.a);
                if (l87 != null) {
                    u68 u68 = (u68) mediaKeyboardWidget.c.getValue();
                    u68.getClass();
                    taf.o(u68.X, new p68(l87));
                    l87 l872 = l87.Z;
                    n0c n0c = mediaKeyboardWidget.y0;
                    n0c n0c2 = mediaKeyboardWidget.w0;
                    n0c n0c3 = mediaKeyboardWidget.x0;
                    if (l87 == l872) {
                        k77[] k77Arr3 = MediaKeyboardWidget.G0;
                        viewArr2 = new View[]{(View) n0c3.T0(mediaKeyboardWidget, k77Arr3[6])};
                        viewArr = new View[]{(View) n0c2.T0(mediaKeyboardWidget, k77Arr3[5]), (View) n0c.T0(mediaKeyboardWidget, k77Arr3[7])};
                    } else {
                        k77[] k77Arr4 = MediaKeyboardWidget.G0;
                        viewArr2 = new View[]{(View) n0c2.T0(mediaKeyboardWidget, k77Arr4[5]), (View) n0c.T0(mediaKeyboardWidget, k77Arr4[7])};
                        viewArr = new View[]{(View) n0c3.T0(mediaKeyboardWidget, k77Arr4[6])};
                    }
                    AnimatorSet animatorSet = mediaKeyboardWidget.F0;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.addUpdateListener(new yl(ofFloat, 4, viewArr2));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat2.addUpdateListener(new yl(ofFloat2, 4, viewArr));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet2.addListener(new fh(animatorSet2, new b78(viewArr2, 0), 1));
                    animatorSet2.addListener(new fh(animatorSet2, new b78(viewArr, 1), 0));
                    animatorSet2.setDuration(200);
                    animatorSet2.start();
                    mediaKeyboardWidget.F0 = animatorSet2;
                }
                mediaKeyboardWidget.n0().post(new eq6(8, mediaKeyboardWidget));
                return;
            default:
                lx3 lx32 = (lx3) this.b;
                sgc sgc3 = (sgc) lx32.w0.get(i);
                int i5 = lx32.x0;
                if (i != i5) {
                    sgc sgc4 = (sgc) lx32.w0.get(i5);
                    if (sgc4 != null) {
                        Iterator it4 = sgc4.e().iterator();
                        while (it4.hasNext()) {
                            ((vgc) it4.next()).a.setOptionsMenuHidden(true);
                        }
                    }
                    if (sgc3 != null) {
                        Iterator it5 = sgc3.e().iterator();
                        while (it5.hasNext()) {
                            ((vgc) it5.next()).a.setOptionsMenuHidden(false);
                        }
                    }
                    lx32.x0 = i;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ hg0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
