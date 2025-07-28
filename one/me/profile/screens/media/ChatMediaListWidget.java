package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/media/ChatMediaListWidget;", "Lone/me/sdk/arch/Widget;", "Loc2;", "Ltq3;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lie2;", "type", "(JLie2;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ChatMediaListWidget extends Widget implements oc2, tq3, lc3 {
    public static final /* synthetic */ k77[] w0;
    public final t97 X;
    public final n0c Y;
    public final nl0 Z;
    public rh8 a;
    public final e3 b;
    public final jr c;
    public final t97 o;

    static {
        Class<ChatMediaListWidget> cls = ChatMediaListWidget.class;
        w0 = new k77[]{new hc9(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), m4b.g(m7c.a, cls, "mediaType", "getMediaType()Lone/me/profile/screens/media/model/ChatMediaType;", 0), new khb(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new khb(cls, "emptyView", "getEmptyView()Lone/me/profile/screens/media/view/ChatMediaEmptyView;", 0)};
    }

    public ChatMediaListWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.b = hwf.t();
        this.c = new jr(ie2.class, "media_type");
        this.o = createViewModelLazy(gf2.class, new s(25, new x2(bundle, this, 19)));
        this.X = i6b.a.getAccessor().d(sya.class);
        this.Y = viewBinding(j8a.j0);
        gf2 m0 = m0();
        i22 v = m0.v();
        xm8 xm8 = v != null ? v.c : null;
        Long valueOf = xm8 != null ? Long.valueOf(xm8.k()) : null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            vc2 x = m0.x();
            if (x != null) {
                udd.p(x.a, "load: time = %d, loadOperation = %s", new Object[]{Long.valueOf(longValue), x.w0});
                if (longValue != 0) {
                    synchronized (x.w0) {
                        try {
                            synchronized (x.w0) {
                            }
                            if (x.w0.b == longValue) {
                                udd.R(x.a, (IOException) null, "load: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                            } else {
                                x.y0.a();
                                x.x0.a();
                                x.w0.a();
                                x.w0.b = longValue;
                                iu iuVar = x.w0;
                                w63 w63 = new w63(new y63(0, new gu(new du(x, longValue, 1))).k(x.c).h(x.o), 1, new eu(x, 2));
                                pn1 pn1 = new pn1(new eu(x, 3), 0, new fu(x, 1));
                                w63.i(pn1);
                                iuVar.o = pn1;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        this.Z = binding(new nl1(7, this));
    }

    public static final EndlessRecyclerView2 l0(ChatMediaListWidget chatMediaListWidget) {
        chatMediaListWidget.getClass();
        return (EndlessRecyclerView2) chatMediaListWidget.Y.T0(chatMediaListWidget, w0[2]);
    }

    public final void i(int i, Bundle bundle) {
        Object obj;
        if (bundle != null) {
            long j = bundle.getLong("selected_message_id");
            long j2 = bundle.getLong("selected_attach_id");
            gf2 m0 = m0();
            Iterator it = ((le2) m0.S0.getValue()).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                rh8 rh8 = (rh8) obj;
                if (rh8.j() == j && rh8.h() == j2) {
                    break;
                }
            }
            rh8 rh82 = (rh8) obj;
            if (rh82 != null) {
                m0.C(i, rh82);
            }
        }
    }

    public final gf2 m0() {
        return (gf2) this.o.getValue();
    }

    public final ie2 n0() {
        k77 k77 = w0[1];
        return (ie2) this.c.a(this);
    }

    public final void o0(rh8 rh8) {
        gf2 m0 = m0();
        qod D = xs7.D(m0.a, m0.w().b(), ru3.b, new we2(m0, rh8, (Continuation) null));
        m0.H0.o1(m0, gf2.V0[0], D);
    }

    public final void onAttach(View view) {
        if (n0() == ie2.b) {
            v40 v40 = ((sya) this.X.getValue()).b;
            v40.Y = true;
            v40.d();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        RecyclerView endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(j8a.j0);
        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        endlessRecyclerView2.setPager(m0().R0);
        endlessRecyclerView2.setThreshold(20);
        endlessRecyclerView2.setAdapter(new pc2(((x4a) i6b.a.getAccessor().c(x4a.class)).a(), this));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        w84 w84 = new w84();
        w84.g = false;
        endlessRecyclerView2.setItemAnimator(w84);
        endlessRecyclerView2.setOverScrollMode(2);
        k77[] k77Arr = w0;
        k77 k77 = k77Arr[3];
        nl0 nl0 = this.Z;
        endlessRecyclerView2.setEmptyView((bc2) nl0.getValue());
        endlessRecyclerView2.setHasFixedSize(true);
        if (rc2.$EnumSwitchMapping$0[n0().ordinal()] == 1) {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new GridLayoutManager(3));
            endlessRecyclerView2.j(new vi2(3, a24.X(((float) 3) * dh4.c().getDisplayMetrics().density), 3));
        } else {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        frameLayout.addView(endlessRecyclerView2);
        k77 k772 = k77Arr[3];
        frameLayout.addView((bc2) nl0.getValue());
        return frameLayout;
    }

    public final void onDetach(View view) {
        if (n0() == ie2.b) {
            v40 v40 = ((sya) this.X.getValue()).b;
            v40.Y = false;
            if (v40.X) {
                v40.X = false;
                mib mib = v40.b;
                mib.b();
                mib.h.remove(v40.Z);
            }
        }
    }

    public final void onDismiss() {
        g37 g37 = (g37) this.b.T0(this, w0[0]);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        this.a = null;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        t0c t0c = m0().T0;
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new sc2((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(m0().O0, getViewLifecycleOwner().R(), ob7), new tc2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p0(rh8 rh8, View view) {
        lp.K(view, je6.LONG_PRESS);
        if (this.a == null) {
            k77[] k77Arr = w0;
            k77 k77 = k77Arr[0];
            e3 e3Var = this.b;
            g37 g37 = (g37) e3Var.T0(this, k77);
            if (g37 == null || !g37.isActive()) {
                e3Var.o1(this, k77Arr[0], xs7.E(getViewLifecycleScope(), (hu3) null, ru3.b, new uc2(this, rh8, view, (Continuation) null), 1));
            }
        }
    }

    public final void y(int i, Bundle bundle) {
        rh8 rh8 = this.a;
        if (rh8 != null) {
            this.a = null;
            m0().C(i, rh8);
        }
    }

    public ChatMediaListWidget(long j, ie2 ie2) {
        this(jjd.j(new wia[]{new wia("chat_id", Long.valueOf(j)), new wia("media_type", ie2)}));
    }
}
