package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;

/* renamed from: l9e  reason: default package */
public final class l9e extends LinearLayout {
    public static final /* synthetic */ int D0 = 0;
    public Drawable A0;
    public int B0 = 2;
    public final /* synthetic */ TabLayout C0;
    public j9e a;
    public TextView b;
    public ImageView c;
    public View o;
    public we0 w0;
    public View x0;
    public TextView y0;
    public ImageView z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l9e(TabLayout tabLayout, Context context) {
        super(context);
        this.C0 = tabLayout;
        f(context);
        int i = tabLayout.w0;
        WeakHashMap weakHashMap = eaf.a;
        setPaddingRelative(i, tabLayout.x0, tabLayout.y0, tabLayout.z0);
        setGravity(17);
        setOrientation(tabLayout.V0 ^ true ? 1 : 0);
        setClickable(true);
        v9f.d(this, zza.b(getContext(), 1002));
    }

    private we0 getBadge() {
        return this.w0;
    }

    private we0 getOrCreateBadge() {
        if (this.w0 == null) {
            Context context = getContext();
            this.w0 = new we0(we0.D0, we0.C0, context);
        }
        c();
        we0 we0 = this.w0;
        if (we0 != null) {
            return we0;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public final void a(View view) {
        if (this.w0 != null && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            we0 we0 = this.w0;
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            we0.setBounds(rect);
            we0.h(view, (FrameLayout) null);
            if (we0.c() != null) {
                we0.c().setForeground(we0);
            } else {
                view.getOverlay().add(we0);
            }
            this.o = view;
        }
    }

    public final void b() {
        if (this.w0 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.o;
            if (view != null) {
                we0 we0 = this.w0;
                if (we0 != null) {
                    if (we0.c() != null) {
                        we0.c().setForeground((Drawable) null);
                    } else {
                        view.getOverlay().remove(we0);
                    }
                }
                this.o = null;
            }
        }
    }

    public final void c() {
        j9e j9e;
        if (this.w0 == null) {
            return;
        }
        if (this.x0 != null) {
            b();
            return;
        }
        ImageView imageView = this.c;
        if (imageView == null || (j9e = this.a) == null || j9e.a == null) {
            TextView textView = this.b;
            if (textView == null || this.a == null) {
                b();
            } else if (this.o != textView) {
                b();
                a(this.b);
            } else {
                d(textView);
            }
        } else if (this.o != imageView) {
            b();
            a(this.c);
        } else {
            d(imageView);
        }
    }

    public final void d(View view) {
        we0 we0 = this.w0;
        if (we0 != null && view == this.o) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            we0.setBounds(rect);
            we0.h(view, (FrameLayout) null);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0;
        if ((drawable == null || !drawable.isStateful()) ? false : this.A0.setState(drawableState)) {
            invalidate();
            this.C0.invalidate();
        }
    }

    public final void e() {
        boolean z;
        g();
        j9e j9e = this.a;
        if (j9e != null) {
            TabLayout tabLayout = j9e.f;
            if (tabLayout != null) {
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == j9e.d) {
                    z = true;
                    setSelected(z);
                }
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }
        z = false;
        setSelected(z);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.content.Context r10) {
        /*
            r9 = this;
            com.google.android.material.tabs.TabLayout r0 = r9.C0
            int r1 = r0.L0
            r2 = 0
            if (r1 == 0) goto L_0x001f
            android.graphics.drawable.Drawable r10 = defpackage.am7.n(r10, r1)
            r9.A0 = r10
            if (r10 == 0) goto L_0x0021
            boolean r10 = r10.isStateful()
            if (r10 == 0) goto L_0x0021
            android.graphics.drawable.Drawable r10 = r9.A0
            int[] r1 = r9.getDrawableState()
            r10.setState(r1)
            goto L_0x0021
        L_0x001f:
            r9.A0 = r2
        L_0x0021:
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r1 = 0
            r10.setColor(r1)
            android.content.res.ColorStateList r1 = r0.F0
            if (r1 == 0) goto L_0x0071
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r3 = 925353388(0x3727c5ac, float:1.0E-5)
            r1.setCornerRadius(r3)
            r3 = -1
            r1.setColor(r3)
            android.content.res.ColorStateList r3 = r0.F0
            int[] r4 = defpackage.lp.h
            int[] r5 = defpackage.lp.g
            int r5 = defpackage.lp.p(r3, r5)
            int[] r6 = defpackage.lp.f
            int r7 = defpackage.lp.p(r3, r6)
            int[] r8 = android.util.StateSet.NOTHING
            int[][] r4 = new int[][]{r4, r6, r8}
            int[] r6 = defpackage.lp.e
            int r3 = defpackage.lp.p(r3, r6)
            int[] r3 = new int[]{r5, r7, r3}
            android.content.res.ColorStateList r5 = new android.content.res.ColorStateList
            r5.<init>(r4, r3)
            android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
            boolean r4 = r0.Z0
            if (r4 == 0) goto L_0x0069
            r10 = r2
        L_0x0069:
            if (r4 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r2 = r1
        L_0x006d:
            r3.<init>(r5, r10, r2)
            r10 = r3
        L_0x0071:
            java.util.WeakHashMap r1 = defpackage.eaf.a
            r9.setBackground(r10)
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9e.f(android.content.Context):void");
    }

    public final void g() {
        int i;
        ViewParent parent;
        j9e j9e = this.a;
        View view = j9e != null ? j9e.e : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.x0;
                if (!(view2 == null || (parent = view2.getParent()) == null)) {
                    ((ViewGroup) parent).removeView(this.x0);
                }
                addView(view);
            }
            this.x0 = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable((Drawable) null);
            }
            TextView textView2 = (TextView) view.findViewById(16908308);
            this.y0 = textView2;
            if (textView2 != null) {
                this.B0 = textView2.getMaxLines();
            }
            this.z0 = (ImageView) view.findViewById(16908294);
        } else {
            View view3 = this.x0;
            if (view3 != null) {
                removeView(view3);
                this.x0 = null;
            }
            this.y0 = null;
            this.z0 = null;
        }
        if (this.x0 == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(wrb.design_layout_tab_icon, this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(wrb.design_layout_tab_text, this, false);
                this.b = textView3;
                addView(textView3);
                this.B0 = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.C0;
            textView4.setTextAppearance(tabLayout.A0);
            if (!isSelected() || (i = tabLayout.C0) == -1) {
                this.b.setTextAppearance(tabLayout.B0);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.D0;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            h(this.b, this.c, true);
            c();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new zm1(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new zm1(this, textView5));
            }
        } else {
            TextView textView6 = this.y0;
            if (!(textView6 == null && this.z0 == null)) {
                h(textView6, this.z0, false);
            }
        }
        if (j9e != null && !TextUtils.isEmpty(j9e.c)) {
            setContentDescription(j9e.c);
        }
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.x0};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.x0};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                i = z ? Math.max(i, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return i - i2;
    }

    public j9e getTab() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.widget.TextView r9, android.widget.ImageView r10, boolean r11) {
        /*
            r8 = this;
            j9e r0 = r8.a
            r1 = 0
            if (r0 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r0.a
            if (r0 == 0) goto L_0x000e
            android.graphics.drawable.Drawable r0 = r0.mutate()
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            com.google.android.material.tabs.TabLayout r2 = r8.C0
            if (r0 == 0) goto L_0x001f
            android.content.res.ColorStateList r3 = r2.E0
            defpackage.um4.h(r0, r3)
            android.graphics.PorterDuff$Mode r3 = r2.I0
            if (r3 == 0) goto L_0x001f
            defpackage.um4.i(r0, r3)
        L_0x001f:
            j9e r3 = r8.a
            if (r3 == 0) goto L_0x0026
            java.lang.CharSequence r3 = r3.b
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r4 = 8
            r5 = 0
            if (r10 == 0) goto L_0x003e
            if (r0 == 0) goto L_0x0038
            r10.setImageDrawable(r0)
            r10.setVisibility(r5)
            r8.setVisibility(r5)
            goto L_0x003e
        L_0x0038:
            r10.setVisibility(r4)
            r10.setImageDrawable(r1)
        L_0x003e:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r6 = 1
            r0 = r0 ^ r6
            if (r9 == 0) goto L_0x0065
            if (r0 == 0) goto L_0x004e
            j9e r7 = r8.a
            r7.getClass()
            goto L_0x004f
        L_0x004e:
            r6 = r5
        L_0x004f:
            if (r0 == 0) goto L_0x0053
            r7 = r3
            goto L_0x0054
        L_0x0053:
            r7 = r1
        L_0x0054:
            r9.setText(r7)
            if (r6 == 0) goto L_0x005b
            r7 = r5
            goto L_0x005c
        L_0x005b:
            r7 = r4
        L_0x005c:
            r9.setVisibility(r7)
            if (r0 == 0) goto L_0x0066
            r8.setVisibility(r5)
            goto L_0x0066
        L_0x0065:
            r6 = r5
        L_0x0066:
            if (r11 == 0) goto L_0x00a8
            if (r10 == 0) goto L_0x00a8
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            if (r6 == 0) goto L_0x0082
            int r11 = r10.getVisibility()
            if (r11 != 0) goto L_0x0082
            android.content.Context r11 = r8.getContext()
            float r11 = defpackage.gwf.m(r11, r4)
            int r11 = (int) r11
            goto L_0x0083
        L_0x0082:
            r11 = r5
        L_0x0083:
            boolean r2 = r2.V0
            if (r2 == 0) goto L_0x0099
            int r2 = r9.getMarginEnd()
            if (r11 == r2) goto L_0x00a8
            r9.setMarginEnd(r11)
            r9.bottomMargin = r5
            r10.setLayoutParams(r9)
            r10.requestLayout()
            goto L_0x00a8
        L_0x0099:
            int r2 = r9.bottomMargin
            if (r11 == r2) goto L_0x00a8
            r9.bottomMargin = r11
            r9.setMarginEnd(r5)
            r10.setLayoutParams(r9)
            r10.requestLayout()
        L_0x00a8:
            j9e r9 = r8.a
            if (r9 == 0) goto L_0x00ae
            java.lang.CharSequence r1 = r9.c
        L_0x00ae:
            if (r0 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = r1
        L_0x00b2:
            defpackage.dme.a(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l9e.h(android.widget.TextView, android.widget.ImageView, boolean):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        we0 we0 = this.w0;
        if (we0 != null && we0.isVisible()) {
            we0 we02 = this.w0;
            CharSequence charSequence = null;
            if (we02.isVisible()) {
                xe0 xe0 = we02.X.b;
                String str = xe0.y0;
                if (str != null) {
                    CharSequence charSequence2 = xe0.D0;
                    charSequence = charSequence2 != null ? charSequence2 : str;
                } else if (!we02.f()) {
                    charSequence = xe0.E0;
                } else if (!(xe0.F0 == 0 || (context = (Context) we02.a.get()) == null)) {
                    charSequence = (we02.w0 == -2 || we02.d() <= (i = we02.w0)) ? context.getResources().getQuantityString(xe0.F0, we02.d(), new Object[]{Integer.valueOf(we02.d())}) : context.getString(xe0.G0, new Object[]{Integer.valueOf(i)});
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) k4.a(isSelected(), 0, 1, this.a.d, 1).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) g4.e.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(wsb.item_view_role_description));
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.C0;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.M0, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.J0;
            int i3 = this.B0;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.K0;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            int i4 = (f > textSize ? 1 : (f == textSize ? 0 : -1));
            if (i4 != 0 || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.U0 == 1 && i4 > 0 && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout != null) {
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.a == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        j9e j9e = this.a;
        TabLayout tabLayout = j9e.f;
        if (tabLayout != null) {
            tabLayout.o(j9e, true);
            return true;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }

    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.x0;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(j9e j9e) {
        if (j9e != this.a) {
            this.a = j9e;
            e();
        }
    }
}
