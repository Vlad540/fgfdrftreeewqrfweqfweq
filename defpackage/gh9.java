package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* renamed from: gh9  reason: default package */
public final class gh9 {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public gh9(View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        try {
            return xbf.a(f3, this.c, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(f3);
            return false;
        }
    }

    public final boolean b(float f, float f2) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        try {
            return xbf.b(f3, this.c, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(f3);
            return false;
        }
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent f;
        int i4;
        int i5;
        int[] iArr3;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int[] iArr4 = iArr2;
        if (!this.d || (f = f(i8)) == null) {
            return false;
        }
        if (i6 != 0 || i7 != 0) {
            View view = this.c;
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                int i9 = iArr4[0];
                i4 = iArr4[1];
                i5 = i9;
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr3 = this.e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            boolean z = f instanceof hh9;
            View view2 = this.c;
            if (z) {
                ((hh9) f).n(view2, i, i2, iArr3, i3);
            } else if (i8 == 0) {
                try {
                    xbf.c(f, view2, i, i7, iArr3);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f);
                }
            }
            if (iArr4 != null) {
                view.getLocationInWindow(iArr4);
                iArr4[0] = iArr4[0] - i5;
                iArr4[1] = iArr4[1] - i4;
            }
            return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
        } else if (iArr4 == null) {
            return false;
        } else {
            iArr4[0] = 0;
            iArr4[1] = 0;
            return false;
        }
    }

    public final void d(int i, int i2, int i3, int[] iArr) {
        e(0, i, 0, i2, (int[]) null, i3, iArr);
    }

    public final boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent f;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (!this.d || (f = f(i8)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        View view = this.c;
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr5 = this.e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        boolean z = f instanceof ih9;
        View view2 = this.c;
        if (z) {
            ((ih9) f).i(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (f instanceof hh9) {
                ((hh9) f).j(view2, i, i2, i3, i4, i5);
            } else if (i8 == 0) {
                try {
                    xbf.d(f, view2, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f);
                }
            }
        }
        if (iArr4 != null) {
            view.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    public final ViewParent f(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean g(int i) {
        return f(i) != null;
    }

    public final boolean h(int i, int i2) {
        boolean z;
        if (g(i2)) {
            return true;
        }
        if (this.d) {
            View view = this.c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof hh9;
                if (z2) {
                    z = ((hh9) parent).k(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = xbf.f(parent, view2, view, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.a = parent;
                    } else if (i2 == 1) {
                        this.b = parent;
                    }
                    if (z2) {
                        ((hh9) parent).l(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            xbf.e(parent, view2, view, i);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    public final void i(int i) {
        ViewParent f = f(i);
        if (f != null) {
            boolean z = f instanceof hh9;
            View view = this.c;
            if (z) {
                ((hh9) f).m(view, i);
            } else if (i == 0) {
                try {
                    xbf.g(f, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f);
                }
            }
            if (i == 0) {
                this.a = null;
            } else if (i == 1) {
                this.b = null;
            }
        }
    }
}
