package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ym  reason: default package */
public final class ym implements Window.Callback {
    public boolean X;
    public final /* synthetic */ dn Y;
    public final Window.Callback a;
    public mv4 b;
    public boolean c;
    public boolean o;

    public ym(dn dnVar, Window.Callback callback) {
        this.Y = dnVar;
        if (callback != null) {
            this.a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.c = true;
            callback.onContentChanged();
            this.c = false;
        } catch (Throwable th) {
            this.c = false;
            throw th;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        orf.a(this.a, list, menu, i);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.o;
        Window.Callback callback = this.a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.Y.t(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.a.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        dn dnVar = this.Y;
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (n1g != null && n1g.J(keyCode, keyEvent)) {
            return true;
        }
        cn cnVar = dnVar.b1;
        if (cnVar == null || !dnVar.E(cnVar, keyEvent.getKeyCode(), keyEvent)) {
            if (dnVar.b1 == null) {
                cn y = dnVar.y(0);
                dnVar.F(y, keyEvent);
                boolean E = dnVar.E(y, keyEvent.getKeyCode(), keyEvent);
                y.k = false;
                if (E) {
                    return true;
                }
            }
            return false;
        }
        cn cnVar2 = dnVar.b1;
        if (cnVar2 == null) {
            return true;
        }
        cnVar2.l = true;
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    public final void onContentChanged() {
        if (this.c) {
            this.a.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof pl8)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i) {
        mv4 mv4 = this.b;
        if (mv4 != null) {
            View view = i == 0 ? new View(((wle) mv4.b).f.a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.a.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        dn dnVar = this.Y;
        if (i == 108) {
            dnVar.z();
            n1g n1g = dnVar.D0;
            if (n1g != null) {
                n1g.j(true);
            }
        } else {
            dnVar.getClass();
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (this.X) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        dn dnVar = this.Y;
        if (i == 108) {
            dnVar.z();
            n1g n1g = dnVar.D0;
            if (n1g != null) {
                n1g.j(false);
            }
        } else if (i == 0) {
            cn y = dnVar.y(i);
            if (y.m) {
                dnVar.q(y, false);
            }
        } else {
            dnVar.getClass();
        }
    }

    public final void onPointerCaptureChanged(boolean z) {
        prf.a(this.a, z);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        pl8 pl8 = menu instanceof pl8 ? (pl8) menu : null;
        if (i == 0 && pl8 == null) {
            return false;
        }
        if (pl8 != null) {
            pl8.M0 = true;
        }
        mv4 mv4 = this.b;
        if (mv4 != null && i == 0) {
            wle wle = (wle) mv4.b;
            if (!wle.i) {
                wle.f.l = true;
                wle.i = true;
            }
        }
        boolean onPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (pl8 != null) {
            pl8.M0 = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        pl8 pl8 = this.Y.y(0).h;
        if (pl8 != null) {
            d(list, pl8, i);
        } else {
            d(list, menu, i);
        }
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return nrf.a(this.a, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [stf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v12, types: [pod, n7, java.lang.Object, nl8] */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        dn dnVar = this.Y;
        dnVar.getClass();
        if (i != 0) {
            return nrf.b(this.a, callback, i);
        }
        Context context = dnVar.z0;
        ? obj = new Object();
        obj.b = context;
        obj.a = callback;
        obj.c = new ArrayList();
        obj.o = new kgd();
        n7 n7Var = dnVar.J0;
        if (n7Var != null) {
            n7Var.a();
        }
        b2b b2b = new b2b((Object) dnVar, 3, (Object) obj);
        dnVar.z();
        n1g n1g = dnVar.D0;
        if (n1g != null) {
            dnVar.J0 = n1g.Y(b2b);
        }
        if (dnVar.J0 == null) {
            zbf zbf = dnVar.N0;
            if (zbf != null) {
                zbf.b();
            }
            n7 n7Var2 = dnVar.J0;
            if (n7Var2 != null) {
                n7Var2.a();
            }
            if (dnVar.C0 != null) {
                boolean z = dnVar.f1;
            }
            if (dnVar.K0 == null) {
                boolean z2 = dnVar.X0;
                Context context2 = dnVar.z0;
                if (z2) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context2.getTheme();
                    theme.resolveAttribute(ylb.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context2.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        ar3 ar3 = new ar3(context2, 0);
                        ar3.getTheme().setTo(newTheme);
                        context2 = ar3;
                    }
                    dnVar.K0 = new ActionBarContextView(context2, (AttributeSet) null);
                    PopupWindow popupWindow = new PopupWindow(context2, (AttributeSet) null, ylb.actionModePopupWindowStyle);
                    dnVar.L0 = popupWindow;
                    c1b.d(popupWindow, 2);
                    dnVar.L0.setContentView(dnVar.K0);
                    dnVar.L0.setWidth(-1);
                    context2.getTheme().resolveAttribute(ylb.actionBarSize, typedValue, true);
                    dnVar.K0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context2.getResources().getDisplayMetrics()));
                    dnVar.L0.setHeight(-2);
                    dnVar.M0 = new sm(dnVar, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) dnVar.P0.findViewById(pob.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        dnVar.z();
                        n1g n1g2 = dnVar.D0;
                        Context w = n1g2 != null ? n1g2.w() : null;
                        if (w != null) {
                            context2 = w;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context2));
                        dnVar.K0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (dnVar.K0 != null) {
                zbf zbf2 = dnVar.N0;
                if (zbf2 != null) {
                    zbf2.b();
                }
                dnVar.K0.e();
                Context context3 = dnVar.K0.getContext();
                ActionBarContextView actionBarContextView = dnVar.K0;
                ? obj2 = new Object();
                obj2.c = context3;
                obj2.o = actionBarContextView;
                obj2.X = b2b;
                pl8 pl8 = new pl8(actionBarContextView.getContext());
                pl8.A0 = 1;
                obj2.w0 = pl8;
                pl8.X = obj2;
                if (((m7) b2b.b).k(obj2, pl8)) {
                    obj2.h();
                    dnVar.K0.c(obj2);
                    dnVar.J0 = obj2;
                    if (dnVar.O0 && (viewGroup = dnVar.P0) != null && viewGroup.isLaidOut()) {
                        dnVar.K0.setAlpha(0.0f);
                        zbf a2 = eaf.a(dnVar.K0);
                        a2.a(1.0f);
                        dnVar.N0 = a2;
                        a2.d(new tm(1, dnVar));
                    } else {
                        dnVar.K0.setAlpha(1.0f);
                        dnVar.K0.setVisibility(0);
                        if (dnVar.K0.getParent() instanceof View) {
                            WeakHashMap weakHashMap = eaf.a;
                            r9f.c((View) dnVar.K0.getParent());
                        }
                    }
                    if (dnVar.L0 != null) {
                        dnVar.A0.getDecorView().post(dnVar.M0);
                    }
                } else {
                    dnVar.J0 = null;
                }
            }
            dnVar.H();
            dnVar.J0 = dnVar.J0;
        }
        dnVar.H();
        n7 n7Var3 = dnVar.J0;
        if (n7Var3 != null) {
            return obj.q(n7Var3);
        }
        return null;
    }

    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
