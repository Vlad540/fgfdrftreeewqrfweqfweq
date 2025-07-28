package one.me.sdk.arch;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0002\u0001\b&\u0018\u0000 ª\u00012\u00020\u0001:\u0002«\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0015¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0015¢\u0006\u0004\b,\u0010+J5\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u000e\b\b\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\bø\u0001\u0000¢\u0006\u0004\b2\u00103J?\u00109\u001a\b\u0012\u0004\u0012\u00028\u000001\"\n\b\u0000\u0010.\u0018\u0001*\u00020-2\u0006\u00105\u001a\u0002042\u0010\b\n\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\bø\u0001\u0000¢\u0006\u0004\b7\u00108J;\u0010>\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0/H\u0001¢\u0006\u0004\b>\u0010?JG\u0010B\u001a\b\u0012\u0004\u0012\u00028\u000001\"\b\b\u0000\u0010.*\u00020-2\u0006\u00105\u001a\u0002042\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000:2\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010/H\u0001¢\u0006\u0004\b@\u0010AJ%\u0010E\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010C*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000H\"\b\b\u0000\u0010G*\u00020\u000b2\b\b\u0001\u0010D\u001a\u00020\u0004H\u0004¢\u0006\u0004\bI\u0010JJ-\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000M\"\b\b\u0000\u0010G*\u00020K2\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0004¢\u0006\u0004\bN\u0010OJ=\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020R0H2\b\b\u0001\u0010P\u001a\u00020\u00042\u0016\b\u0002\u0010S\u001a\u0010\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u0012\u0018\u00010QH\u0004¢\u0006\u0004\bT\u0010UJ%\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020V0H2\b\b\u0001\u0010P\u001a\u00020\u0004H\u0004¢\u0006\u0004\bW\u0010JJS\u0010^\u001a\u00020\u0012\"\u0004\b\u0000\u0010G*\b\u0012\u0004\u0012\u00028\u00000X2\b\b\u0002\u0010Z\u001a\u00020Y2$\b\u0004\u0010]\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\\\u0012\u0006\u0012\u0004\u0018\u00010K0[H\bø\u0001\u0000¢\u0006\u0004\b^\u0010_J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010a\u001a\u00020`2\u0006\u0010b\u001a\u00028\u0000H\b¢\u0006\u0004\b\u0003\u0010dJ&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000c\"\u0006\b\u0000\u0010G\u0018\u00012\u0006\u0010a\u001a\u00020`H\b¢\u0006\u0004\b\u0003\u0010eJ)\u0010g\u001a\u00020\u00122\u0014\b\u0004\u0010f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120QH\bø\u0001\u0000¢\u0006\u0004\bg\u0010hJ\u000f\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bj\u0010kJ\u0019\u0010n\u001a\u0004\u0018\u00010\u00002\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010p\u001a\u00020\u00122\u0006\u0010o\u001a\u00020\u0001H\u0002¢\u0006\u0004\bp\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010rR\u001a\u0010t\u001a\u00020s8\u0000X\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR&\u0010z\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020y0x8\u0000X\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u001b\u00105\u001a\u0002048\u0016X\u0004¢\u0006\r\n\u0004\b5\u0010~\u001a\u0005\b\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018\u0016XD¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020`8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010~R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\"\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u0012\u0006\b\u0001\u0010\u0001R\u001f\u0010\u0001\u001a\u00020i8BX\u0002¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\b\u0001\u0010kR\u0015\u0010\u0001\u001a\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0015\u0010£\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001R\u0015\u0010§\u0001\u001a\u00030¤\u00018F¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R\u0015\u0010©\u0001\u001a\u00030 \u00018F¢\u0006\b\u001a\u0006\b¨\u0001\u0010¢\u0001\u0002\u0007\n\u0005\b20\u0001¨\u0006¬\u0001"}, d2 = {"Lone/me/sdk/arch/Widget;", "Lrr3;", "Landroid/os/Bundle;", "args", "", "layoutRes", "<init>", "(Landroid/os/Bundle;I)V", "Lim;", "requireActivity", "()Lim;", "Landroid/view/View;", "requireView", "()Landroid/view/View;", "Landroid/content/res/Resources;", "requireResources", "()Landroid/content/res/Resources;", "newArgs", "Ljue;", "updateArgs", "(Landroid/os/Bundle;)V", "oldArgs", "onUpdateArgs", "(Landroid/os/Bundle;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedViewState", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;)V", "Lwr3;", "changeHandler", "Lxr3;", "changeType", "onChangeStarted", "(Lwr3;Lxr3;)V", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Ltaf;", "VM", "Lkotlin/Function0;", "vmProducer", "Lt97;", "viewModel", "(Ls16;)Lt97;", "Linc;", "scopeId", "defaultFactory", "sharedViewModel-qk3jasM", "(Ljava/lang/String;Ls16;)Lt97;", "sharedViewModel", "Ljava/lang/Class;", "viewModelClass", "Lsaf;", "factoryProducer", "createViewModelLazy", "(Ljava/lang/Class;Ls16;)Lt97;", "getSharedViewModel-cp94BC8", "(Ljava/lang/String;Ljava/lang/Class;Ls16;)Lt97;", "getSharedViewModel", "V", "id", "findViewById", "(I)Landroid/view/View;", "T", "Ln0c;", "viewBinding", "(I)Ln0c;", "", "bindAction", "Lnl0;", "binding", "(Ls16;)Lnl0;", "containerId", "Lkotlin/Function1;", "Lsgc;", "routerBuilder", "childRouter", "(ILu16;)Ln0c;", "Lax2;", "childSlotRouter", "Lpj5;", "Lob7;", "minActiveState", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "block", "collectInViewScope", "(Lpj5;Lob7;Li26;)V", "", "key", "defaultValue", "Ljr;", "(Ljava/lang/String;Ljava/lang/Object;)Ljr;", "(Ljava/lang/String;)Ljr;", "action", "doActionIfRootExist", "(Lu16;)V", "Laz1;", "addIfNeedChildWidgetContainer", "()Laz1;", "findWidgetByScopeId-iP7A0G4", "(Ljava/lang/String;)Lone/me/sdk/arch/Widget;", "findWidgetByScopeId", "controller", "finalizeCleanActions", "(Lrr3;)V", "I", "Lmrf;", "viewModelStore", "Lmrf;", "getViewModelStore$arch_release", "()Lmrf;", "Ljc9;", "Lbz2;", "cleanActions", "Ljc9;", "getCleanActions$arch_release", "()Ljc9;", "Ljava/lang/String;", "getScopeId-IluPPks", "()Ljava/lang/String;", "Lsy6;", "insetsConfig", "Lsy6;", "getInsetsConfig", "()Lsy6;", "Lrnc;", "screenDelegate", "Lrnc;", "getScreenDelegate", "()Lrnc;", "", "isDialog", "Z", "()Z", "tag", "irf", "internalLifecycleListener", "Lirf;", "Lds3;", "_viewLifecycleOwner", "Lds3;", "get_viewLifecycleOwner$annotations", "()V", "childWidgetContainer$delegate", "Lt97;", "getChildWidgetContainer", "childWidgetContainer", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lyb7;", "getLifecycleScope", "()Lyb7;", "lifecycleScope", "Lnc7;", "getViewLifecycleOwner", "()Lnc7;", "viewLifecycleOwner", "getViewLifecycleScope", "viewLifecycleScope", "Companion", "frf", "arch_release"}, k = 1, mv = {2, 0, 0})
public abstract class Widget extends rr3 {
    public static final String ARG_SCOPE_ID = "arg_key_scope_id";
    public static final frf Companion = new Object();
    private static final AtomicInteger allocationsCount = new AtomicInteger(0);
    private ds3 _viewLifecycleOwner;
    private final t97 childWidgetContainer$delegate;
    private final jc9 cleanActions;
    private final sy6 insetsConfig;
    private final irf internalLifecycleListener;
    private final boolean isDialog;
    private final int layoutRes;
    private final String scopeId;
    private final rnc screenDelegate;
    /* access modifiers changed from: private */
    public final String tag;
    private final mrf viewModelStore;

    public Widget() {
        this((Bundle) null, 0, 3, (x54) null);
    }

    /* access modifiers changed from: private */
    public static final Object binding$lambda$8(s16 s16, Object obj) {
        return s16.invoke();
    }

    /* access modifiers changed from: private */
    public static final jue binding$lambda$9(Widget widget, Object obj, bz2 bz2) {
        jc9 jc9 = widget.cleanActions;
        int e = jc9.e(obj);
        if (e < 0) {
            e = ~e;
        }
        Object[] objArr = jc9.c;
        Object obj2 = objArr[e];
        jc9.b[e] = obj;
        objArr[e] = bz2;
        return jue.a;
    }

    public static /* synthetic */ n0c childRouter$default(Widget widget, int i, u16 u16, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                u16 = null;
            }
            return widget.childRouter(i, u16);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: childRouter");
    }

    /* access modifiers changed from: private */
    public static final sgc childRouter$lambda$10(Widget widget, int i, u16 u16, sgc sgc) {
        ViewGroup viewGroup = (ViewGroup) widget.requireView().findViewById(i);
        if (u16 == null) {
            return widget.getChildRouter(viewGroup);
        }
        sgc childRouter = widget.getChildRouter(viewGroup);
        u16.invoke(childRouter);
        return childRouter;
    }

    /* access modifiers changed from: private */
    public static final ax2 childSlotRouter$lambda$11(Widget widget, int i, ax2 ax2) {
        return new ax2(widget.getChildRouter((ViewGroup) widget.requireView().findViewById(i)));
    }

    /* access modifiers changed from: private */
    public static final az1 childWidgetContainer_delegate$lambda$13(Widget widget) {
        FrameLayout frameLayout = new FrameLayout(widget.getContext());
        frameLayout.setId(upb.arch_child_widget_wrapper_id);
        return frameLayout;
    }

    public static void collectInViewScope$default(Widget widget, pj5 pj5, ob7 ob7, i26 i26, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                ob7 = ob7.o;
            }
            ez3.N(new ck5(wx3.e(pj5, widget.getViewLifecycleOwner().R(), ob7), new grf(i26, (Continuation) null), 5), widget.getViewLifecycleScope());
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectInViewScope");
    }

    /* access modifiers changed from: private */
    public final void finalizeCleanActions(rr3 rr3) {
        long[] jArr;
        long[] jArr2;
        int i;
        if (!this.cleanActions.h()) {
            String w = xie.w(rr3);
            fn6 fn6 = udd.e;
            Object obj = null;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, w, wn6.h(getCleanActions$arch_release().e, "view detached, call onFinalize for clean actions "), (Throwable) null);
            }
            jc9 jc9 = this.cleanActions;
            Object[] objArr = jc9.c;
            long[] jArr3 = jc9.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr3[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((255 & j) < 128) {
                                ml0 ml0 = (ml0) ((bz2) objArr[(i2 << 3) + i5]);
                                if (!ml0.a) {
                                    nl0 nl0 = ml0.b;
                                    nl0.X = new WeakReference(nl0.o);
                                    nl0.o = obj;
                                    ml0.a = true;
                                }
                                String h = rf0.h("Binder_", xie.w(ml0.c));
                                nl0 nl02 = ml0.b;
                                fn6 fn62 = udd.e;
                                if (fn62 != null && fn62.c()) {
                                    tn7 tn7 = tn7.X;
                                    WeakReference weakReference = nl02.X;
                                    jArr2 = jArr3;
                                    fn62.d(tn7, h, "onFinalize " + weakReference + "/" + (weakReference != null ? weakReference.get() : obj), (Throwable) null);
                                } else {
                                    jArr2 = jArr3;
                                }
                                WeakReference weakReference2 = ml0.b.X;
                                if (weakReference2 != null) {
                                    weakReference2.clear();
                                }
                                obj = null;
                                ml0.b.X = null;
                                i = 8;
                            } else {
                                jArr2 = jArr3;
                                i = i3;
                            }
                            j >>= i;
                            i5++;
                            i3 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i4 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                    jArr3 = jArr;
                }
            }
            this.cleanActions.a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036 A[EDGE_INSN: B:29:0x0036->B:16:0x0036 ?: BREAK  
    EDGE_INSN: B:30:0x0036->B:16:0x0036 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: findWidgetByScopeId-iP7A0G4  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final one.me.sdk.arch.Widget m21findWidgetByScopeIdiP7A0G4(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            boolean r0 = hhd.f(r4, r0)
            r1 = 0
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            java.lang.String r0 = "default"
            boolean r0 = hhd.f(r4, r0)
            if (r0 == 0) goto L_0x0013
            return r3
        L_0x0013:
            rr3 r0 = r3.getParentController()
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x001e
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            if (r0 == 0) goto L_0x0036
            java.lang.String r2 = r0.m24getScopeIdIluPPks()
            boolean r2 = hhd.f(r2, r4)
            if (r2 != 0) goto L_0x0036
            rr3 r0 = r0.getParentController()
            boolean r2 = r0 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x001e
            one.me.sdk.arch.Widget r0 = (one.me.sdk.arch.Widget) r0
            goto L_0x001f
        L_0x0036:
            rr3 r3 = r3.getTargetController()
            boolean r2 = r3 instanceof one.me.sdk.arch.Widget
            if (r2 == 0) goto L_0x0041
            one.me.sdk.arch.Widget r3 = (one.me.sdk.arch.Widget) r3
            goto L_0x0042
        L_0x0041:
            r3 = r1
        L_0x0042:
            if (r0 != 0) goto L_0x0055
            if (r3 == 0) goto L_0x004a
            java.lang.String r1 = r3.m24getScopeIdIluPPks()
        L_0x004a:
            if (r1 != 0) goto L_0x004e
            r4 = 0
            goto L_0x0052
        L_0x004e:
            boolean r4 = hhd.f(r1, r4)
        L_0x0052:
            if (r4 == 0) goto L_0x0055
            r0 = r3
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.arch.Widget.m21findWidgetByScopeIdiP7A0G4(java.lang.String):one.me.sdk.arch.Widget");
    }

    private final az1 getChildWidgetContainer() {
        return (az1) this.childWidgetContainer$delegate.getValue();
    }

    /* renamed from: getSharedViewModel-cp94BC8$default  reason: not valid java name */
    public static /* synthetic */ t97 m22getSharedViewModelcp94BC8$default(Widget widget, String str, Class cls, s16 s16, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                s16 = null;
            }
            return widget.m25getSharedViewModelcp94BC8(str, cls, s16);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSharedViewModel-cp94BC8");
    }

    private static /* synthetic */ void get_viewLifecycleOwner$annotations() {
    }

    /* renamed from: sharedViewModel-qk3jasM$default  reason: not valid java name */
    public static /* synthetic */ t97 m23sharedViewModelqk3jasM$default(Widget widget, String str, s16 s16, int i, Object obj) {
        if (obj == null) {
            hhd.M();
            throw null;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedViewModel-qk3jasM");
    }

    /* access modifiers changed from: private */
    public static final View viewBinding$lambda$5(Widget widget, int i, View view) {
        String str;
        if (view != null) {
            bz2 bz2 = (bz2) widget.cleanActions.i(view);
        }
        try {
            return widget.requireView().findViewById(i);
        } catch (Throwable th) {
            str = new kcc(th);
        }
        String h = wn6.h(i, "#");
        if (str instanceof kcc) {
            str = h;
        }
        throw new IllegalStateException(rf0.h("could not find view ", str), th);
    }

    /* access modifiers changed from: private */
    public static final jue viewBinding$lambda$6(Widget widget, View view, bz2 bz2) {
        jc9 jc9 = widget.cleanActions;
        int e = jc9.e(view);
        if (e < 0) {
            e = ~e;
        }
        Object[] objArr = jc9.c;
        Object obj = objArr[e];
        jc9.b[e] = view;
        objArr[e] = bz2;
        return jue.a;
    }

    /* access modifiers changed from: private */
    public static final boolean viewBinding$lambda$7(Widget widget, View view) {
        return view.getParent() == widget.getView();
    }

    public final az1 addIfNeedChildWidgetContainer() {
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return null;
        }
        if (getChildWidgetContainer().getParent() == null) {
            ek8.d(viewGroup, getChildWidgetContainer(), Integer.valueOf(viewGroup.getChildCount()));
        }
        return getChildWidgetContainer();
    }

    public final /* synthetic */ <T> jr args(String str, T t) {
        hhd.M();
        throw null;
    }

    public final <T> nl0 binding(s16 s16) {
        return new nl0((rr3) this, (u16) new ljc(15, s16), new drf(this, 1), 8);
    }

    public final n0c childRouter(int i, u16 u16) {
        return new nl0((rr3) this, (u16) new odc(this, i, u16), (drf) null, 12);
    }

    public final n0c childSlotRouter(int i) {
        return new nl0((rr3) this, (u16) new crf(this, i, 0), (drf) null, 12);
    }

    public final <T> void collectInViewScope(pj5 pj5, ob7 ob7, i26 i26) {
        ez3.N(new ck5(wx3.e(pj5, getViewLifecycleOwner().R(), ob7), new grf(i26, (Continuation) null), 5), getViewLifecycleScope());
    }

    public final <VM extends taf> t97 createViewModelLazy(Class<VM> cls, s16 s16) {
        mrf mrf = this.viewModelStore;
        mrf.getClass();
        String h = rf0.h("one.me.sdk.arch.ViewModelStore:key:", cls.getCanonicalName());
        mrf.b.k(h, (saf) s16.invoke());
        return new hrf(this, cls);
    }

    public final void doActionIfRootExist(u16 u16) {
        View view = getView();
        if (view != null) {
            u16.invoke(view);
        }
    }

    public final <V extends View> V findViewById(int i) {
        View view = getView();
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public final jc9 getCleanActions$arch_release() {
        return this.cleanActions;
    }

    public final Context getContext() {
        return requireActivity();
    }

    public sy6 getInsetsConfig() {
        return this.insetsConfig;
    }

    public final yb7 getLifecycleScope() {
        return xs7.A(this.lifecycleOwner);
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public String m24getScopeIdIluPPks() {
        return this.scopeId;
    }

    public rnc getScreenDelegate() {
        return this.screenDelegate;
    }

    /* renamed from: getSharedViewModel-cp94BC8  reason: not valid java name */
    public final <VM extends taf> t97 m25getSharedViewModelcp94BC8(String str, Class<VM> cls, s16 s16) {
        return new xaf(this, str, cls, s16);
    }

    public final nc7 getViewLifecycleOwner() {
        return this._viewLifecycleOwner;
    }

    public final yb7 getViewLifecycleScope() {
        return xs7.A(this._viewLifecycleOwner);
    }

    public final mrf getViewModelStore$arch_release() {
        return this.viewModelStore;
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onChangeStarted(wr3 wr3, xr3 xr3) {
        if (xr3 == xr3.X || xr3 == xr3.c) {
            getScreenDelegate().l();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(this.layoutRes, viewGroup, false);
    }

    public void onUpdateArgs(Bundle bundle, Bundle bundle2) {
    }

    public void onViewCreated(View view) {
    }

    public final im requireActivity() {
        return getActivity();
    }

    public final Resources requireResources() {
        Resources resources = getResources();
        if (resources != null) {
            return resources;
        }
        throw new IllegalArgumentException(("Resources are null because of widget " + this + " is not attached to an activity").toString());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalArgumentException("view is null!".toString());
    }

    /* renamed from: sharedViewModel-qk3jasM  reason: not valid java name */
    public final /* synthetic */ <VM extends taf> t97 m26sharedViewModelqk3jasM(String str, s16 s16) {
        hhd.M();
        throw null;
    }

    public final void updateArgs(Bundle bundle) {
        Bundle deepCopy = getArgs().deepCopy();
        getArgs().clear();
        getArgs().putAll(bundle);
        onUpdateArgs(deepCopy, getArgs());
    }

    public final <T extends View> n0c viewBinding(int i) {
        return new nl0((rr3) this, (u16) new crf(this, i, 1), (i26) new drf(this, 0), (u16) new erf(this, 0));
    }

    public final /* synthetic */ <VM extends taf> t97 viewModel(s16 s16) {
        hhd.M();
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Widget(Bundle bundle, int i, int i2, x54 x54) {
        this((i2 & 1) != 0 ? null : bundle, (i2 & 2) != 0 ? -1 : i);
    }

    public final /* synthetic */ <T> jr args(String str) {
        hhd.M();
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [nc7, ds3, java.lang.Object] */
    public Widget(Bundle bundle, int i) {
        super(bundle);
        this.layoutRes = i;
        this.viewModelStore = new mrf();
        this.cleanActions = new jc9(3);
        this.scopeId = "default";
        this.insetsConfig = sy6.c;
        this.screenDelegate = j06.Y;
        this.tag = getClass().getName();
        irf irf = new irf(this);
        this.internalLifecycleListener = irf;
        ? obj = new Object();
        obj.a = new pc7(obj);
        addLifecycleListener(new o63(2, obj));
        this._viewLifecycleOwner = obj;
        String name = getClass().getName();
        int incrementAndGet = allocationsCount.incrementAndGet();
        udd.q(name, "allocations count = " + incrementAndGet);
        addLifecycleListener(irf);
        addLifecycleListener(un7.a);
        this.childWidgetContainer$delegate = ez3.O(3, new q6e(13, this));
    }
}
