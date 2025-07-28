package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import one.me.sdk.arch.Widget;

/* renamed from: rr3  reason: default package */
public abstract class rr3 {
    private static final String KEY_ARGS = "Controller.args";
    private static final String KEY_CHILD_ROUTERS = "Controller.childRouters";
    private static final String KEY_CLASS_NAME = "Controller.className";
    private static final String KEY_INSTANCE_ID = "Controller.instanceId";
    private static final String KEY_NEEDS_ATTACH = "Controller.needsAttach";
    private static final String KEY_OVERRIDDEN_POP_HANDLER = "Controller.overriddenPopHandler";
    private static final String KEY_OVERRIDDEN_PUSH_HANDLER = "Controller.overriddenPushHandler";
    private static final String KEY_REQUESTED_PERMISSIONS = "Controller.requestedPermissions";
    private static final String KEY_RETAIN_VIEW_MODE = "Controller.retainViewMode";
    private static final String KEY_SAVED_STATE = "Controller.savedState";
    private static final String KEY_TARGET_INSTANCE_ID = "Controller.target.instanceId";
    private static final String KEY_VIEW_STATE = "Controller.viewState";
    static final String KEY_VIEW_STATE_BUNDLE = "Controller.viewState.bundle";
    private static final String KEY_VIEW_STATE_HIERARCHY = "Controller.viewState.hierarchy";
    private final Bundle args;
    private boolean attached;
    private boolean attachedToUnownedParent;
    private boolean awaitingParentAttach;
    private final List<as3> childRouters = new ArrayList();
    private boolean destroyed;
    private WeakReference<View> destroyedView;
    private boolean hasOptionsMenu;
    private boolean hasSavedViewState;
    String instanceId;
    boolean isBeingDestroyed;
    private boolean isContextAvailable;
    boolean isDetachFrozen;
    private boolean isPerformingExitTransition;
    private final List<pr3> lifecycleListeners = new ArrayList();
    public final nc7 lifecycleOwner;
    private boolean needsAttach;
    final ww9 onBackPressedCallback;
    boolean onBackPressedDispatcherEnabled;
    private final ArrayList<tgc> onRouterSetListeners = new ArrayList<>();
    private boolean optionsMenuHidden;
    private wr3 overriddenPopHandler;
    private wr3 overriddenPushHandler;
    private rr3 parentController;
    private final ArrayList<String> requestedPermissions = new ArrayList<>();
    private qr3 retainViewMode = qr3.a;
    sgc router;
    private Bundle savedInstanceState;
    private String targetInstanceId;
    View view;
    private l9f viewAttachHandler;
    boolean viewIsAttached;
    Bundle viewState;
    boolean viewWasDetached;

    /* JADX WARNING: type inference failed for: r6v6, types: [xha, java.lang.Object] */
    public rr3(Bundle bundle) {
        Constructor constructor;
        Widget widget = (Widget) this;
        this.onBackPressedCallback = new or3(widget, 0);
        this.lifecycleOwner = new iu1(widget);
        this.args = bundle == null ? new Bundle(getClass().getClassLoader()) : bundle;
        this.instanceId = UUID.randomUUID().toString();
        Constructor[] constructors = getClass().getConstructors();
        if (Z(constructors) == null) {
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i++;
            }
            if (constructor == null) {
                throw new RuntimeException(getClass() + " does not have a constructor that takes a Bundle argument or a default constructor. Controllers must have one of these in order to restore their states.");
            }
        }
        ? obj = new Object();
        obj.o = Bundle.EMPTY;
        addLifecycleListener(new vha((xha) obj, widget));
    }

    public static Constructor Z(Constructor[] constructorArr) {
        for (Constructor constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0] == Bundle.class) {
                return constructor;
            }
        }
        return null;
    }

    public static rr3 newInstance(Bundle bundle) {
        rr3 rr3;
        Constructor constructor;
        String string = bundle.getString(KEY_CLASS_NAME);
        Class l = udd.l(string, false);
        Constructor[] constructors = l.getConstructors();
        Constructor Z = Z(constructors);
        Bundle bundle2 = bundle.getBundle(KEY_ARGS);
        if (bundle2 != null) {
            bundle2.setClassLoader(l.getClassLoader());
        }
        if (Z != null) {
            try {
                rr3 = (rr3) Z.newInstance(new Object[]{bundle2});
            } catch (Exception e) {
                StringBuilder m = hr1.m("An exception occurred while creating a new instance of ", string, ". ");
                m.append(e.getMessage());
                throw new RuntimeException(m.toString(), e);
            }
        } else {
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i++;
            }
            rr3 = (rr3) constructor.newInstance((Object[]) null);
            if (bundle2 != null) {
                rr3.args.putAll(bundle2);
            }
        }
        rr3.getClass();
        Bundle bundle3 = bundle.getBundle(KEY_VIEW_STATE);
        rr3.viewState = bundle3;
        if (bundle3 != null) {
            bundle3.setClassLoader(rr3.getClass().getClassLoader());
        }
        rr3.instanceId = bundle.getString(KEY_INSTANCE_ID);
        rr3.targetInstanceId = bundle.getString(KEY_TARGET_INSTANCE_ID);
        rr3.requestedPermissions.addAll(bundle.getStringArrayList(KEY_REQUESTED_PERMISSIONS));
        Bundle bundle4 = bundle.getBundle(KEY_OVERRIDDEN_PUSH_HANDLER);
        HashMap hashMap = wr3.c;
        rr3.overriddenPushHandler = swb.s(bundle4);
        rr3.overriddenPopHandler = swb.s(bundle.getBundle(KEY_OVERRIDDEN_POP_HANDLER));
        rr3.needsAttach = bundle.getBoolean(KEY_NEEDS_ATTACH);
        rr3.retainViewMode = qr3.values()[bundle.getInt(KEY_RETAIN_VIEW_MODE, 0)];
        for (Bundle bundle5 : bundle.getParcelableArrayList(KEY_CHILD_ROUTERS)) {
            as3 as3 = new as3();
            if (as3.j == null) {
                as3.j = rr3;
                as3.Q(rr3.onBackPressedDispatcherEnabled);
            }
            as3.N(bundle5);
            rr3.childRouters.add(as3);
        }
        Bundle bundle6 = bundle.getBundle(KEY_SAVED_STATE);
        rr3.savedInstanceState = bundle6;
        if (bundle6 != null) {
            bundle6.setClassLoader(rr3.getClass().getClassLoader());
        }
        rr3.a0();
        return rr3;
    }

    private void removeViewReference(Context context) {
        View view2 = this.view;
        if (view2 != null) {
            if (context == null) {
                context = view2.getContext();
            }
            if (!this.isBeingDestroyed && !this.hasSavedViewState) {
                c0(this.view);
            }
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((pr3) it.next()).s(this, this.view);
            }
            onDestroyView(this.view);
            l9f l9f = this.viewAttachHandler;
            if (l9f != null) {
                View view3 = this.view;
                view3.removeOnAttachStateChangeListener(l9f);
                if (l9f.Y != null && (view3 instanceof ViewGroup)) {
                    l9f.a((ViewGroup) view3).removeOnAttachStateChangeListener(l9f.Y);
                    l9f.Y = null;
                }
            }
            this.viewAttachHandler = null;
            this.viewIsAttached = false;
            if (this.isBeingDestroyed) {
                this.destroyedView = new WeakReference<>(this.view);
            }
            this.view = null;
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((pr3) it2.next()).l(this);
            }
            for (as3 Z : this.childRouters) {
                Z.Z();
            }
        }
        if (this.isBeingDestroyed) {
            if (context == null) {
                context = getActivity();
            }
            if (this.isContextAvailable) {
                onContextUnavailable(context);
            }
            if (!this.destroyed) {
                Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                while (it3.hasNext()) {
                    ((pr3) it3.next()).r(this);
                }
                this.destroyed = true;
                onDestroy();
                this.parentController = null;
                Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
                while (it4.hasNext()) {
                    ((pr3) it4.next()).k(this);
                }
            }
        }
    }

    public final void Y(boolean z) {
        this.isBeingDestroyed = true;
        sgc sgc = this.router;
        if (sgc != null) {
            sgc.Y(this.instanceId);
        }
        for (as3 c : this.childRouters) {
            c.c(false);
        }
        if (!this.attached) {
            removeViewReference((Context) null);
        } else if (z) {
            detach(this.view, true, false);
        }
    }

    public final void a0() {
        Bundle bundle = this.savedInstanceState;
        if (bundle != null && this.router != null) {
            onRestoreInstanceState(bundle);
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((pr3) it.next()).c(this, this.savedInstanceState);
            }
            this.savedInstanceState = null;
        }
    }

    public final void activityDestroyed(Activity activity) {
        if (activity.isChangingConfigurations()) {
            detach(this.view, true, false);
        } else {
            Y(true);
        }
        onContextUnavailable(activity);
    }

    public final void activityPaused(Activity activity) {
        onActivityPaused(activity);
    }

    public final void activityResumed(Activity activity) {
        View view2;
        boolean z = this.attached;
        if (!z && (view2 = this.view) != null && this.viewIsAttached) {
            attach(view2);
        } else if (z) {
            this.needsAttach = false;
            this.hasSavedViewState = false;
        }
        onActivityResumed(activity);
    }

    public final void activityStarted(Activity activity) {
        l9f l9f = this.viewAttachHandler;
        if (l9f != null) {
            l9f.c = false;
            l9f.b();
        }
        onActivityStarted(activity);
    }

    public final void activityStopped(Activity activity) {
        boolean z = this.attached;
        l9f l9f = this.viewAttachHandler;
        if (l9f != null) {
            l9f.c = true;
            l9f.c(true);
        }
        if (z && activity.isChangingConfigurations()) {
            this.needsAttach = true;
        }
        onActivityStopped(activity);
    }

    public final void addLifecycleListener(pr3 pr3) {
        if (!this.lifecycleListeners.contains(pr3)) {
            this.lifecycleListeners.add(pr3);
        }
    }

    public void attach(View view2) {
        boolean z = this.router == null || view2.getParent() != this.router.i;
        this.attachedToUnownedParent = z;
        if (!z && !this.isBeingDestroyed) {
            rr3 rr3 = this.parentController;
            if (rr3 == null || rr3.attached) {
                this.awaitingParentAttach = false;
                this.hasSavedViewState = false;
                Iterator it = new ArrayList(this.lifecycleListeners).iterator();
                while (it.hasNext()) {
                    ((pr3) it.next()).n(this, view2);
                }
                this.attached = true;
                this.needsAttach = this.router.h;
                onAttach(view2);
                if (this.hasOptionsMenu && !this.optionsMenuHidden) {
                    this.router.o();
                }
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((pr3) it2.next()).g(this);
                }
                for (as3 next : this.childRouters) {
                    Iterator it3 = next.a.iterator();
                    while (true) {
                        u1 u1Var = (u1) it3;
                        if (!u1Var.hasNext()) {
                            break;
                        }
                        rr3 rr32 = ((vgc) u1Var.next()).a;
                        if (rr32.awaitingParentAttach) {
                            rr32.attach(rr32.view);
                        }
                    }
                    if ((next.j == null || next.i == null) ? false : true) {
                        next.I();
                    }
                }
                return;
            }
            this.awaitingParentAttach = true;
        }
    }

    public final void b0() {
        for (as3 next : this.childRouters) {
            if (next.j == null || next.i == null) {
                View findViewById = this.view.findViewById(next.k);
                if (findViewById instanceof ViewGroup) {
                    next.b0(this, (ViewGroup) findViewById);
                    next.I();
                }
            }
        }
    }

    public final void c0(View view2) {
        this.hasSavedViewState = true;
        this.viewState = new Bundle(getClass().getClassLoader());
        SparseArray sparseArray = new SparseArray();
        view2.saveHierarchyState(sparseArray);
        this.viewState.putSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY, sparseArray);
        Bundle bundle = new Bundle(getClass().getClassLoader());
        onSaveViewState(view2, bundle);
        this.viewState.putBundle(KEY_VIEW_STATE_BUNDLE, bundle);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((pr3) it.next()).f(this);
        }
    }

    public final void changeEnded(wr3 wr3, xr3 xr3) {
        WeakReference<View> weakReference;
        ViewGroup viewGroup;
        if (!xr3.b) {
            this.isPerformingExitTransition = false;
            for (as3 a0 : this.childRouters) {
                a0.a0(false);
            }
        }
        onChangeEnded(wr3, xr3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((pr3) it.next()).a(this, wr3, xr3);
        }
        if (this.isBeingDestroyed && !this.viewIsAttached && !this.attached && (weakReference = this.destroyedView) != null) {
            View view2 = weakReference.get();
            if (!(this.router.i == null || view2 == null || view2.getParent() != (viewGroup = this.router.i))) {
                viewGroup.removeView(view2);
            }
            this.destroyedView = null;
        }
        wr3.getClass();
    }

    public final void changeStarted(wr3 wr3, xr3 xr3) {
        if (!xr3.b) {
            this.isPerformingExitTransition = true;
            for (as3 a0 : this.childRouters) {
                a0.a0(true);
            }
        }
        onChangeStarted(wr3, xr3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((pr3) it.next()).b(this, wr3, xr3);
        }
    }

    public final void createOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public final void destroy() {
        Y(false);
    }

    public void detach(View view2, boolean z, boolean z2) {
        if (!this.attachedToUnownedParent) {
            for (as3 F : this.childRouters) {
                F.F();
            }
        }
        boolean z3 = !z2 && (z || this.retainViewMode == qr3.a || this.isBeingDestroyed);
        if (this.attached) {
            if (!this.awaitingParentAttach) {
                Iterator it = new ArrayList(this.lifecycleListeners).iterator();
                while (it.hasNext()) {
                    ((pr3) it.next()).t(this);
                }
                this.attached = false;
                onDetach(view2);
                if (this.hasOptionsMenu && !this.optionsMenuHidden) {
                    this.router.o();
                }
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((pr3) it2.next()).m(this);
                }
            } else {
                this.attached = false;
            }
        }
        this.awaitingParentAttach = false;
        if (z3) {
            removeViewReference(view2 != null ? view2.getContext() : null);
        }
    }

    public final boolean didRequestPermission(String str) {
        return this.requestedPermissions.contains(str);
    }

    public final void executeWithRouter(tgc tgc) {
        if (this.router != null) {
            tgc.a();
        } else {
            this.onRouterSetListeners.add(tgc);
        }
    }

    public final rr3 findController(String str) {
        if (this.instanceId.equals(str)) {
            return this;
        }
        for (as3 f : this.childRouters) {
            rr3 f2 = f.f(str);
            if (f2 != null) {
                return f2;
            }
        }
        return null;
    }

    public final Activity getActivity() {
        sgc sgc = this.router;
        if (sgc != null) {
            return sgc.d();
        }
        return null;
    }

    public final Context getApplicationContext() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return null;
    }

    public Bundle getArgs() {
        return this.args;
    }

    public final sgc getChildRouter(ViewGroup viewGroup) {
        return getChildRouter(viewGroup, (String) null);
    }

    public final List<sgc> getChildRouters() {
        ArrayList arrayList = new ArrayList(this.childRouters.size());
        arrayList.addAll(this.childRouters);
        return arrayList;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean getNeedsAttach() {
        return this.needsAttach;
    }

    public final ex9 getOnBackPressedDispatcher() {
        sgc sgc = this.router;
        if (sgc != null) {
            return sgc.h();
        }
        return null;
    }

    public wr3 getOverriddenPopHandler() {
        return this.overriddenPopHandler;
    }

    public final wr3 getOverriddenPushHandler() {
        return this.overriddenPushHandler;
    }

    public final rr3 getParentController() {
        return this.parentController;
    }

    public final Resources getResources() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getResources();
        }
        return null;
    }

    public qr3 getRetainViewMode() {
        return this.retainViewMode;
    }

    public final sgc getRouter() {
        return this.router;
    }

    public final rr3 getTargetController() {
        if (this.targetInstanceId != null) {
            return this.router.i().f(this.targetInstanceId);
        }
        return null;
    }

    public final View getView() {
        return this.view;
    }

    @Deprecated
    public boolean handleBack() {
        ArrayList arrayList = new ArrayList();
        for (as3 e : this.childRouters) {
            arrayList.addAll(e.e());
        }
        Collections.sort(arrayList, new yz(17));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rr3 rr3 = ((vgc) it.next()).a;
            if (rr3.isAttached()) {
                sgc router2 = rr3.getRouter();
                router2.getClass();
                ct0.i();
                if (router2.m()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v6, types: [l9f, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public final View inflate(ViewGroup viewGroup) {
        View view2 = this.view;
        if (!(view2 == null || view2.getParent() == null || this.view.getParent() == viewGroup)) {
            View view3 = this.view;
            detach(view3, true, false);
            removeViewReference(view3.getContext());
        }
        if (this.view == null) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((pr3) it.next()).q(this);
            }
            Bundle bundle = this.viewState;
            View onCreateView = onCreateView(LayoutInflater.from(viewGroup.getContext()), viewGroup, bundle == null ? null : bundle.getBundle(KEY_VIEW_STATE_BUNDLE));
            this.view = onCreateView;
            if (onCreateView != viewGroup) {
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((pr3) it2.next()).j(this, this.view);
                }
                View view4 = this.view;
                Bundle bundle2 = this.viewState;
                if (bundle2 != null) {
                    view4.restoreHierarchyState(bundle2.getSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY));
                    Bundle bundle3 = this.viewState.getBundle(KEY_VIEW_STATE_BUNDLE);
                    bundle3.setClassLoader(getClass().getClassLoader());
                    onRestoreViewState(view4, bundle3);
                    b0();
                    Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                    while (it3.hasNext()) {
                        ((pr3) it3.next()).d(this);
                    }
                }
                if (!this.isBeingDestroyed) {
                    lv1 lv1 = new lv1(1, this);
                    ? obj = new Object();
                    obj.a = false;
                    obj.b = false;
                    obj.c = false;
                    obj.o = 1;
                    obj.X = lv1;
                    this.viewAttachHandler = obj;
                    this.view.addOnAttachStateChangeListener(obj);
                }
            } else {
                throw new IllegalStateException("Controller's onCreateView method returned the parent ViewGroup. Perhaps you forgot to pass false for LayoutInflater.inflate's attachToRoot parameter?");
            }
        } else {
            b0();
        }
        return this.view;
    }

    public final boolean isAttached() {
        return this.attached;
    }

    public final boolean isBeingDestroyed() {
        return this.isBeingDestroyed;
    }

    public final boolean isDestroyed() {
        return this.destroyed;
    }

    public abstract void onActivityPaused(Activity activity);

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public abstract void onActivityResumed(Activity activity);

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onAttach(View view2) {
    }

    public void onChangeEnded(wr3 wr3, xr3 xr3) {
    }

    public abstract void onChangeStarted(wr3 wr3, xr3 xr3);

    public void onContextAvailable(Context context) {
    }

    public void onContextUnavailable() {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onDestroy() {
    }

    public void onDestroyView(View view2) {
    }

    public void onDetach(View view2) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onRestoreInstanceState(Bundle bundle) {
    }

    public void onRestoreViewState(View view2, Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onSaveViewState(View view2, Bundle bundle) {
    }

    public final boolean optionsItemSelected(MenuItem menuItem) {
        return this.attached && this.hasOptionsMenu && !this.optionsMenuHidden && onOptionsItemSelected(menuItem);
    }

    public void overridePopHandler(wr3 wr3) {
        this.overriddenPopHandler = wr3;
    }

    public void overridePushHandler(wr3 wr3) {
        this.overriddenPushHandler = wr3;
    }

    public final void prepareForHostDetach() {
        this.needsAttach = this.needsAttach || this.attached;
        for (as3 F : this.childRouters) {
            F.F();
        }
    }

    public final void prepareOptionsMenu(Menu menu) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onPrepareOptionsMenu(menu);
        }
    }

    public final void registerForActivityResult(int i) {
        executeWithRouter(new kr3(this, i));
    }

    public final void removeChildRouter(sgc sgc) {
        if ((sgc instanceof as3) && this.childRouters.remove(sgc)) {
            sgc.c(true);
        }
    }

    public final void removeLifecycleListener(pr3 pr3) {
        this.lifecycleListeners.remove(pr3);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Cloneable, java.lang.Object[], java.lang.String[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void requestPermissions(java.lang.String[] r3, int r4) {
        /*
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.requestedPermissions
            java.util.List r1 = java.util.Arrays.asList(r3)
            r0.addAll(r1)
            lr3 r0 = new lr3
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            r2.executeWithRouter(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr3.requestPermissions(java.lang.String[], int):void");
    }

    public final void requestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.requestedPermissions.removeAll(Arrays.asList(strArr));
        onRequestPermissionsResult(i, strArr, iArr);
    }

    public final Bundle saveInstanceState() {
        View view2;
        if (!this.hasSavedViewState && (view2 = this.view) != null) {
            c0(view2);
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_CLASS_NAME, getClass().getName());
        bundle.putBundle(KEY_VIEW_STATE, this.viewState);
        bundle.putBundle(KEY_ARGS, this.args);
        bundle.putString(KEY_INSTANCE_ID, this.instanceId);
        bundle.putString(KEY_TARGET_INSTANCE_ID, this.targetInstanceId);
        bundle.putStringArrayList(KEY_REQUESTED_PERMISSIONS, this.requestedPermissions);
        bundle.putBoolean(KEY_NEEDS_ATTACH, this.needsAttach || this.attached);
        bundle.putInt(KEY_RETAIN_VIEW_MODE, this.retainViewMode.ordinal());
        wr3 wr3 = this.overriddenPushHandler;
        if (wr3 != null) {
            bundle.putBundle(KEY_OVERRIDDEN_PUSH_HANDLER, wr3.j());
        }
        wr3 wr32 = this.overriddenPopHandler;
        if (wr32 != null) {
            bundle.putBundle(KEY_OVERRIDDEN_POP_HANDLER, wr32.j());
        }
        ArrayList arrayList = new ArrayList(this.childRouters.size());
        for (as3 O : this.childRouters) {
            Bundle bundle2 = new Bundle();
            O.O(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(KEY_CHILD_ROUTERS, arrayList);
        Bundle bundle3 = new Bundle(getClass().getClassLoader());
        onSaveInstanceState(bundle3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((pr3) it.next()).e(this, bundle3);
        }
        bundle.putBundle(KEY_SAVED_STATE, bundle3);
        return bundle;
    }

    public final void setDetachFrozen(boolean z) {
        ViewGroup viewGroup;
        if (this.isDetachFrozen != z) {
            this.isDetachFrozen = z;
            boolean z2 = !z && this.view != null && this.viewWasDetached;
            for (as3 next : this.childRouters) {
                if (z2) {
                    next.F();
                }
                next.a0(z);
            }
            if (z2) {
                View view2 = this.view;
                detach(view2, false, false);
                if (this.view == null && view2.getParent() == (viewGroup = this.router.i)) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    public final void setHasOptionsMenu(boolean z) {
        boolean z2 = this.attached && !this.optionsMenuHidden && this.hasOptionsMenu != z;
        this.hasOptionsMenu = z;
        if (z2) {
            this.router.o();
        }
    }

    public final void setNeedsAttach(boolean z) {
        this.needsAttach = z;
    }

    public final void setOptionsMenuHidden(boolean z) {
        boolean z2 = this.attached && this.hasOptionsMenu && this.optionsMenuHidden != z;
        this.optionsMenuHidden = z;
        if (z2) {
            this.router.o();
        }
    }

    public final void setParentController(rr3 rr3) {
        this.parentController = rr3;
    }

    public void setRetainViewMode(qr3 qr3) {
        qr3 qr32 = qr3.a;
        if (qr3 == null) {
            qr3 = qr32;
        }
        this.retainViewMode = qr3;
        if (qr3 == qr32 && !this.attached) {
            removeViewReference((Context) null);
        }
    }

    public final void setRouter(sgc sgc) {
        if (this.router != sgc) {
            this.router = sgc;
            a0();
            Iterator<tgc> it = this.onRouterSetListeners.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.onRouterSetListeners.clear();
            return;
        }
        a0();
    }

    public void setTargetController(rr3 rr3) {
        if (this.targetInstanceId == null) {
            this.targetInstanceId = rr3 != null ? rr3.getInstanceId() : null;
            return;
        }
        throw new RuntimeException("Target controller already set. A controller's target may only be set once.");
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        return getActivity().shouldShowRequestPermissionRationale(str);
    }

    public final void startActivity(Intent intent) {
        executeWithRouter(new nr3(this, intent));
    }

    public final void startActivityForResult(Intent intent, int i) {
        executeWithRouter(new lr3(this, intent, i, 0));
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.router.W(this.instanceId, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final sgc getChildRouter(ViewGroup viewGroup, String str) {
        return getChildRouter(viewGroup, str, true);
    }

    public final void onContextAvailable() {
        Activity d = this.router.d();
        if (d != null && !this.isContextAvailable) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((pr3) it.next()).o(this);
            }
            boolean z = this.router.f;
            this.onBackPressedDispatcherEnabled = z;
            if (z) {
                if (d instanceof e83) {
                    getOnBackPressedDispatcher().b(this.onBackPressedCallback);
                } else {
                    throw new IllegalStateException("Host activities must extend ComponentActivity when enabling OnBackPressedDispatcher support.");
                }
            }
            this.isContextAvailable = true;
            onContextAvailable(d);
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((pr3) it2.next()).h(this);
            }
        }
        for (as3 u : this.childRouters) {
            u.u();
        }
    }

    public final void onContextUnavailable(Context context) {
        for (sgc next : this.childRouters) {
            Iterator it = next.a.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    break;
                }
                ((vgc) u1Var.next()).a.onContextUnavailable(context);
            }
            Iterator it2 = next.d.iterator();
            while (it2.hasNext()) {
                ((rr3) it2.next()).onContextUnavailable(context);
            }
        }
        if (this.isContextAvailable) {
            Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
            while (it3.hasNext()) {
                ((pr3) it3.next()).p(this);
            }
            this.isContextAvailable = false;
            onContextUnavailable();
            if (this.onBackPressedDispatcherEnabled) {
                this.onBackPressedCallback.e();
            }
            Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
            while (it4.hasNext()) {
                ((pr3) it4.next()).i(this);
            }
        }
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        executeWithRouter(new mr3(this, intent, i, bundle));
    }

    public final sgc getChildRouter(ViewGroup viewGroup, String str, boolean z) {
        return getChildRouter(viewGroup, str, z, true);
    }

    public final sgc getChildRouter(ViewGroup viewGroup, String str, boolean z, boolean z2) {
        as3 as3;
        int id = viewGroup.getId();
        if (id != -1) {
            Iterator<as3> it = this.childRouters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    as3 = null;
                    break;
                }
                as3 = it.next();
                if (!as3.n && as3.i == null) {
                    String str2 = as3.l;
                    if (str2 != null) {
                        if (str2.equals(str)) {
                            as3.k = id;
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Host ID can't be variable with a null tag");
                    }
                }
                if (as3.k == id && TextUtils.equals(str, as3.l)) {
                    break;
                }
            }
            if (as3 == null) {
                if (z) {
                    int id2 = viewGroup.getId();
                    as3 = new as3();
                    if (z2 || str != null) {
                        as3.k = id2;
                        as3.l = str;
                        as3.n = z2;
                        as3.b0(this, viewGroup);
                        this.childRouters.add(as3);
                        if (this.isPerformingExitTransition) {
                            as3.a0(true);
                        }
                    } else {
                        throw new IllegalStateException("ControllerHostedRouter can't be created without a tag if not bounded to its container");
                    }
                }
            } else if (as3.j == null || as3.i == null) {
                as3.b0(this, viewGroup);
                as3.I();
            }
            return as3;
        }
        throw new IllegalStateException("You must set an id on your container.");
    }
}
