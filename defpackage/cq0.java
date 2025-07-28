package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* renamed from: cq0  reason: default package */
public final class cq0 extends b4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cq0(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r2.b() > 1) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
        /*
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 1: goto L_0x0047;
                case 5: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.c(r2, r3)
            return
        L_0x0009:
            super.c(r2, r3)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r2 = r2.getName()
            r3.setClassName(r2)
            java.lang.Object r1 = r1.e
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            tia r2 = r1.w0
            if (r2 == 0) goto L_0x0025
            int r2 = r2.b()
            r0 = 1
            if (r2 <= r0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r3.setScrollable(r0)
            int r2 = r3.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r2 != r0) goto L_0x0046
            tia r2 = r1.w0
            if (r2 == 0) goto L_0x0046
            int r2 = r2.b()
            r3.setItemCount(r2)
            int r2 = r1.x0
            r3.setFromIndex(r2)
            int r1 = r1.x0
            r3.setToIndex(r1)
        L_0x0046:
            return
        L_0x0047:
            super.c(r2, r3)
            java.lang.Object r1 = r1.e
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r1 = r1.o
            r3.setChecked(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq0.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    public final void d(View view, l4 l4Var) {
        int i = -1;
        boolean z = false;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (this.d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                if (((fq0) obj).z0) {
                    l4Var.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                    return;
                }
                accessibilityNodeInfo.setDismissable(false);
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.w0);
                accessibilityNodeInfo2.setChecked(checkableImageButton.o);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, l4Var.a);
                int i2 = MaterialButtonToggleGroup.C0;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i3 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i3) == view) {
                                i = i4;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.c(i3)) {
                                    i4++;
                                }
                                i3++;
                            }
                        }
                    }
                }
                l4Var.i(k4.a(((MaterialButton) view).G0, 0, 1, i, 1));
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                MaterialCalendar materialCalendar = (MaterialCalendar) obj;
                accessibilityNodeInfo3.setHintText(materialCalendar.A1.getVisibility() == 0 ? materialCalendar.i0(wsb.mtrl_picker_toggle_to_year_selection) : materialCalendar.i0(wsb.mtrl_picker_toggle_to_day_selection));
                return;
            case 4:
                AccessibilityNodeInfo accessibilityNodeInfo4 = l4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).A0);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, l4Var.a);
                l4Var.h(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) obj;
                tia tia = viewPager.w0;
                if (tia != null && tia.b() > 1) {
                    z = true;
                }
                l4Var.j(z);
                if (viewPager.canScrollHorizontally(1)) {
                    l4Var.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    l4Var.a(8192);
                    return;
                }
                return;
        }
    }

    public boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 0:
                if (i == 1048576) {
                    fq0 fq0 = (fq0) this.e;
                    if (fq0.z0) {
                        fq0.cancel();
                        return true;
                    }
                }
                return super.g(view, i, bundle);
            case 5:
                if (super.g(view, i, bundle)) {
                    return true;
                }
                ViewPager viewPager = (ViewPager) this.e;
                if (i != 4096) {
                    if (i == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.x0 - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.x0 + 1);
                    return true;
                }
                return false;
            default:
                return super.g(view, i, bundle);
        }
    }
}
