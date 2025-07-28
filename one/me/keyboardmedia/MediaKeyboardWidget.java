package one.me.keyboardmedia;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lone/me/keyboardmedia/MediaKeyboardWidget;", "Lone/me/sdk/arch/Widget;", "Lmhe;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "", "chatId", "", "onlyEmoji", "(Ljava/lang/String;JZLx54;)V", "c78", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class MediaKeyboardWidget extends Widget implements mhe {
    public static final /* synthetic */ k77[] G0;
    public final p87 A0;
    public rd2 B0;
    public hg0 C0;
    public final EnumMap D0;
    public ObjectAnimator E0;
    public AnimatorSet F0;
    public final n0c X;
    public final n0c Y;
    public final n0c Z;
    public final jr a;
    public final jr b;
    public final t97 c;
    public er7 o;
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;
    public ur3 z0;

    static {
        Class<MediaKeyboardWidget> cls = MediaKeyboardWidget.class;
        khb khb = new khb(cls, "chatId", "getChatId()J", 0);
        n7c n7c = m7c.a;
        G0 = new k77[]{khb, wn6.e(n7c, cls, "onlyEmoji", "getOnlyEmoji()Z", 0), wn6.f(cls, "bottomPanelView", "getBottomPanelView()Landroid/view/View;", 0, n7c), wn6.f(cls, "keyboardBottomTabs", "getKeyboardBottomTabs()Lone/me/keyboardmedia/tablayout/KeyboardTabLayout;", 0, n7c), wn6.f(cls, "keyboardViewPager", "getKeyboardViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, n7c), wn6.f(cls, "settingsButton", "getSettingsButton()Landroid/view/View;", 0, n7c), wn6.f(cls, "removeButton", "getRemoveButton()Landroid/view/View;", 0, n7c), wn6.f(cls, "showcaseButton", "getShowcaseButton()Landroid/view/View;", 0, n7c)};
    }

    public MediaKeyboardWidget(String str, long j, boolean z, x54 x54) {
        this(jjd.j(new wia("arg_key_scope_id", new inc(str)), new wia("arg_key_chat_id", Long.valueOf(j)), new wia("arg_key_only_emoji", Boolean.valueOf(z))));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [rr3, one.me.keyboardmedia.MediaKeyboardWidget] */
    public final void l0() {
        if (getView() != null) {
            List list = this.A0.a;
            int currentItem = n0().getCurrentItem();
            if (currentItem >= 0 && currentItem <= p23.A(list)) {
                l87 l87 = (l87) list.get(currentItem);
                int ordinal = l87.ordinal();
                if (ordinal == 0) {
                    p0(l87, (RecyclerView) n0().findViewById(x5a.n));
                } else if (ordinal == 1) {
                    p0(l87, (RecyclerView) n0().findViewById(x5a.c));
                }
            }
        }
    }

    public final View m0() {
        return (View) this.X.T0(this, G0[2]);
    }

    public final ViewPager2 n0() {
        return (ViewPager2) this.Z.T0(this, G0[4]);
    }

    public final boolean o0() {
        k77 k77 = G0[1];
        return ((Boolean) this.b.a(this)).booleanValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        urd.B(new d78(3, (Continuation) null, 1), frameLayout);
        int i = e87.a;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, e87.a(frameLayout.getContext())));
        ViewPager2 viewPager2 = new ViewPager2(frameLayout.getContext());
        viewPager2.setId(x5a.f);
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOverScrollMode(2);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        swb.r(viewPager2);
        frameLayout.addView(viewPager2);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(x5a.a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a24.X(((float) 48) * dh4.c().getDisplayMetrics().density));
        layoutParams.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams);
        urd.B(new d78(3, (Continuation) null, 0), frameLayout2);
        frameLayout2.setClickable(true);
        View view = new View(frameLayout2.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, a24.W(((double) dh4.c().getDisplayMetrics().density) * 0.5d));
        layoutParams2.gravity = 48;
        view.setLayoutParams(layoutParams2);
        urd.B(new uo3(3, (Continuation) null, 1), view);
        frameLayout2.addView(view);
        int X2 = a24.X(((float) 28) * dh4.c().getDisplayMetrics().density);
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView.setId(x5a.j);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(X2, X2);
        layoutParams3.gravity = 8388627;
        float f = (float) 12;
        layoutParams3.leftMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        appCompatImageView.setLayoutParams(layoutParams3);
        appCompatImageView.setPadding(4, 4, 4, 4);
        urd.B(new ex1(3, (Continuation) null, 1), appCompatImageView);
        a24.Z(appCompatImageView, 300, new b20(5));
        frameLayout2.addView(appCompatImageView);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView2.setId(x5a.k);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(X2, X2);
        layoutParams4.gravity = 8388629;
        layoutParams4.rightMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        appCompatImageView2.setLayoutParams(layoutParams4);
        appCompatImageView2.setPadding(4, 4, 4, 4);
        urd.B(new ex1(3, (Continuation) null, 2), appCompatImageView2);
        a24.Z(appCompatImageView2, 300, new a78(this, 0));
        frameLayout2.addView(appCompatImageView2);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(frameLayout2.getContext(), (AttributeSet) null);
        appCompatImageView3.setId(x5a.i);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(X2, X2);
        layoutParams5.gravity = 8388629;
        layoutParams5.rightMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        appCompatImageView3.setLayoutParams(layoutParams5);
        appCompatImageView3.setPadding(4, 4, 4, 4);
        urd.B(new ex1(3, (Continuation) null, 3), appCompatImageView3);
        appCompatImageView3.setOnClickListener(new a78(this, 1));
        frameLayout2.addView(appCompatImageView3);
        o87 o87 = new o87(frameLayout2.getContext(), (AttributeSet) null);
        o87.setId(x5a.p);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 17;
        int X3 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        o87.setPadding(o87.getPaddingLeft(), X3, o87.getPaddingRight(), X3);
        o87.setLayoutParams(layoutParams6);
        o87.setTabMode(0);
        frameLayout2.addView(o87);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        u68 u68 = (u68) this.c.getValue();
        int currentItem = n0().getCurrentItem();
        List list = this.A0.a;
        u68.getClass();
        if (currentItem >= 0 && currentItem < list.size()) {
            ((ip) u68.c.getValue()).k("app.last.media_keyboard.page.id", Long.valueOf(wn6.c(((l87) list.get(currentItem)).b)));
        }
        ObjectAnimator objectAnimator = this.E0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.E0 = null;
        AnimatorSet animatorSet = this.F0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.F0 = null;
        ur3 ur3 = this.z0;
        if (ur3 != null) {
            ur3.c();
        }
        this.z0 = null;
        hg0 hg0 = this.C0;
        if (hg0 != null) {
            n0().g(hg0);
        }
        this.C0 = null;
        this.D0.clear();
    }

    public final void onThemeChanged(pda pda) {
        ((o87) this.Y.T0(this, G0[3])).onThemeChanged(pda);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [rr3, one.me.sdk.arch.Widget, java.lang.Object, one.me.keyboardmedia.MediaKeyboardWidget] */
    public final void onViewCreated(View view) {
        List list;
        int i = 0;
        er7 er7 = this.o;
        k77[] k77Arr = G0;
        k77 k77 = k77Arr[0];
        long longValue = ((Number) this.a.a(this)).longValue();
        Class<inc> cls = inc.class;
        Object E = ek8.E(getArgs(), "arg_key_scope_id", cls);
        if (E != null) {
            this.B0 = new rd2(this, er7, longValue, ((Parcelable) E).a);
            n0().setAdapter(this.B0);
            ViewPager2 n0 = n0();
            hg0 hg0 = new hg0(9, this);
            this.C0 = hg0;
            n0.b(hg0);
            o87 o87 = (o87) this.Y.T0(this, k77Arr[3]);
            ViewPager2 n02 = n0();
            p87 p87 = this.A0;
            p87.getClass();
            ur3 ur3 = new ur3(o87, n02, new xz(o87, p87, n02, 12));
            ur3.a();
            this.z0 = ur3;
            ex9 onBackPressedDispatcher = getOnBackPressedDispatcher();
            if (onBackPressedDispatcher != null) {
                nc7 nc7 = this.lifecycleOwner;
                or3 or3 = new or3(!o0(), (u16) new gw2(29, this));
                if (nc7 != null) {
                    onBackPressedDispatcher.a(nc7, or3);
                } else {
                    onBackPressedDispatcher.b(or3);
                }
            }
            if (o0()) {
                list = Collections.singletonList(l87.Z);
            } else {
                l87.o.getClass();
                list = l87.X;
            }
            p87.a = list;
            rd2 rd2 = this.B0;
            if (rd2 != null) {
                if (!rd2.C0.isEmpty() || !(!list.isEmpty())) {
                    ug4 e = iu7.e(new l61(3, rd2.C0, list));
                    rd2.C0 = list;
                    e.a(new c9(0, rd2));
                } else {
                    rd2.C0 = list;
                    rd2.p(0, list.size());
                }
            }
            ViewPager2 n03 = n0();
            View childAt = n03.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                recyclerView.setItemAnimator((k6c) null);
                recyclerView.setHasFixedSize(true);
            }
            rd2 rd22 = this.B0;
            if ((rd22 != null ? rd22.C0.size() : 0) > 0) {
                int i2 = 8;
                ((View) this.x0.T0(this, k77Arr[6])).setVisibility(o0() ? 0 : 8);
                ((View) this.w0.T0(this, k77Arr[5])).setVisibility(o0() ^ true ? 0 : 8);
                View view2 = (View) this.y0.T0(this, k77Arr[7]);
                if (!o0()) {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                u68 u68 = (u68) this.c.getValue();
                u68.getClass();
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    } else if (wn6.c(((l87) it.next()).b) == ((ip) u68.c.getValue()).g.getLong("app.last.media_keyboard.page.id", 0)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 >= 0) {
                    i = i3;
                }
                n03.e(i, true);
                int i4 = e87.a;
                n03.measure(View.MeasureSpec.makeMeasureSpec(n03.getContext().getResources().getDisplayMetrics().widthPixels, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(e87.a(n03.getContext()), 1073741824));
                l0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    public final void p0(l87 l87, RecyclerView recyclerView) {
        l87 l872 = l87;
        RecyclerView recyclerView2 = recyclerView;
        EnumMap enumMap = this.D0;
        if (!enumMap.containsKey(l872) && recyclerView2 != null) {
            c78 c78 = new c78(getContext(), new vz0(0, this, MediaKeyboardWidget.class, "showBottomPanel", "showBottomPanel()V", 0, 29), new e78(0, this, MediaKeyboardWidget.class, "hideBottomPanel", "hideBottomPanel()V", 0, 0));
            recyclerView2.m(c78);
            enumMap.put(l872, c78);
        }
    }

    /* JADX WARNING: type inference failed for: r6v20, types: [java.lang.Object, p87] */
    public MediaKeyboardWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = new jr(Long.class, 0L, "arg_key_chat_id");
        this.b = new jr(Boolean.class, Boolean.FALSE, "arg_key_only_emoji");
        Class<inc> cls = inc.class;
        Object E = ek8.E(bundle, "arg_key_scope_id", cls);
        if (E != null) {
            this.c = getSharedViewModel-cp94BC8(((Parcelable) E).a, u68.class, (s16) null);
            this.X = viewBinding(x5a.a);
            this.Y = viewBinding(x5a.p);
            this.Z = viewBinding(x5a.f);
            this.w0 = viewBinding(x5a.j);
            this.x0 = viewBinding(x5a.i);
            this.y0 = viewBinding(x5a.k);
            ? obj = new Object();
            obj.a = hw4.a;
            this.A0 = obj;
            this.D0 = new EnumMap(l87.class);
            return;
        }
        throw new IllegalArgumentException(wn6.i("No value passed for key arg_key_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaKeyboardWidget(String str, long j, boolean z, int i, x54 x54) {
        this(str, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? false : z, (x54) null);
    }
}
