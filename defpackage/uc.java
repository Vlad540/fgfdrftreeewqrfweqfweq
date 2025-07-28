package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* renamed from: uc  reason: default package */
public class uc extends fn implements DialogInterface {
    public final sc Y = new sc(getContext(), this, getWindow());

    public uc(Context context, int i) {
        super(context, g(context, i));
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ylb.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        ListAdapter listAdapter;
        View findViewById;
        int i = 2;
        super.onCreate(bundle);
        sc scVar = this.Y;
        scVar.b.setContentView(scVar.F);
        int i2 = pob.parentPanel;
        Window window = scVar.c;
        View findViewById2 = window.findViewById(i2);
        View findViewById3 = findViewById2.findViewById(pob.topPanel);
        View findViewById4 = findViewById2.findViewById(pob.contentPanel);
        View findViewById5 = findViewById2.findViewById(pob.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(pob.customPanel);
        View view = scVar.h;
        Context context = scVar.a;
        View view2 = null;
        if (view == null) {
            view = scVar.i != 0 ? LayoutInflater.from(context).inflate(scVar.i, viewGroup, false) : null;
        }
        boolean z2 = view != null;
        if (!z2 || !sc.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(pob.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (scVar.j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (scVar.g != null) {
                ((ad7) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(pob.topPanel);
        View findViewById7 = viewGroup.findViewById(pob.contentPanel);
        View findViewById8 = viewGroup.findViewById(pob.buttonPanel);
        ViewGroup b = sc.b(findViewById6, findViewById3);
        ViewGroup b2 = sc.b(findViewById7, findViewById4);
        ViewGroup b3 = sc.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(pob.scrollView);
        scVar.w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        scVar.w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(16908299);
        scVar.B = textView;
        if (textView != null) {
            CharSequence charSequence = scVar.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                scVar.w.removeView(scVar.B);
                if (scVar.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) scVar.w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(scVar.w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(scVar.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(16908313);
        scVar.k = button;
        jsc jsc = scVar.L;
        button.setOnClickListener(jsc);
        boolean isEmpty = TextUtils.isEmpty(scVar.l);
        int i3 = scVar.d;
        if (!isEmpty || scVar.n != null) {
            scVar.k.setText(scVar.l);
            Drawable drawable = scVar.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i3, i3);
                scVar.k.setCompoundDrawables(scVar.n, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            scVar.k.setVisibility(0);
            z = true;
        } else {
            scVar.k.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) b3.findViewById(16908314);
        scVar.o = button2;
        button2.setOnClickListener(jsc);
        if (!TextUtils.isEmpty(scVar.p) || scVar.r != null) {
            scVar.o.setText(scVar.p);
            Drawable drawable2 = scVar.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i3, i3);
                scVar.o.setCompoundDrawables(scVar.r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            scVar.o.setVisibility(0);
            z |= true;
        } else {
            scVar.o.setVisibility(8);
        }
        Button button3 = (Button) b3.findViewById(16908315);
        scVar.s = button3;
        button3.setOnClickListener(jsc);
        if (!TextUtils.isEmpty(scVar.t) || scVar.v != null) {
            scVar.s.setText(scVar.t);
            Drawable drawable3 = scVar.v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i3, i3);
                scVar.s.setCompoundDrawables(scVar.v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            scVar.s.setVisibility(0);
            z |= true;
        } else {
            scVar.s.setVisibility(8);
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(ylb.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                Button button4 = scVar.k;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z) {
                Button button5 = scVar.o;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z) {
                Button button6 = scVar.s;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z) {
            b3.setVisibility(8);
        }
        if (scVar.C != null) {
            b.addView(scVar.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(pob.title_template).setVisibility(8);
        } else {
            scVar.z = (ImageView) window.findViewById(16908294);
            if (!(!TextUtils.isEmpty(scVar.e)) || !scVar.J) {
                window.findViewById(pob.title_template).setVisibility(8);
                scVar.z.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(pob.alertTitle);
                scVar.A = textView2;
                textView2.setText(scVar.e);
                int i4 = scVar.x;
                if (i4 != 0) {
                    scVar.z.setImageResource(i4);
                } else {
                    Drawable drawable4 = scVar.y;
                    if (drawable4 != null) {
                        scVar.z.setImageDrawable(drawable4);
                    } else {
                        scVar.A.setPadding(scVar.z.getPaddingLeft(), scVar.z.getPaddingTop(), scVar.z.getPaddingRight(), scVar.z.getPaddingBottom());
                        scVar.z.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i5 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z4 = b3.getVisibility() != 8;
        if (!z4 && (findViewById = b2.findViewById(pob.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i5 != 0) {
            NestedScrollView nestedScrollView2 = scVar.w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (!(scVar.f == null && scVar.g == null)) {
                view2 = b.findViewById(pob.titleDividerNoCustom);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = b2.findViewById(pob.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = scVar.g;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z4 || i5 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i5 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z4 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
            }
        }
        if (!z3) {
            View view3 = scVar.g;
            if (view3 == null) {
                view3 = scVar.w;
            }
            if (view3 != null) {
                if (!z4) {
                    i = 0;
                }
                int i6 = i5 | i;
                View findViewById10 = window.findViewById(pob.scrollIndicatorUp);
                View findViewById11 = window.findViewById(pob.scrollIndicatorDown);
                WeakHashMap weakHashMap = eaf.a;
                u9f.d(view3, i6, 3);
                if (findViewById10 != null) {
                    b2.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = scVar.g;
        if (alertController$RecycleListView2 != null && (listAdapter = scVar.D) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i7 = scVar.E;
            if (i7 > -1) {
                alertController$RecycleListView2.setItemChecked(i7, true);
                alertController$RecycleListView2.setSelection(i7);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Y.w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Y.w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        sc scVar = this.Y;
        scVar.e = charSequence;
        TextView textView = scVar.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
