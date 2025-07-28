package com.google.android.material.button;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    public static final int C0 = kvb.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final int A0;
    public HashSet B0 = new HashSet();
    public final ArrayList a = new ArrayList();
    public final u5g b = new u5g(17, (Object) this);
    public final LinkedHashSet c = new LinkedHashSet();
    public final d15 o = new d15(3, this);
    public Integer[] w0;
    public boolean x0 = false;
    public boolean y0;
    public boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = defpackage.wlb.materialButtonToggleGroupStyle
            int r4 = C0
            android.content.Context r7 = defpackage.tw7.a(r7, r8, r3, r4)
            r6.<init>(r7, r8, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.a = r7
            u5g r7 = new u5g
            r0 = 17
            r7.<init>((int) r0, (java.lang.Object) r6)
            r6.b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.c = r7
            d15 r7 = new d15
            r0 = 3
            r7.<init>(r0, r6)
            r6.o = r7
            r7 = 0
            r6.x0 = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.B0 = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = defpackage.xvb.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = defpackage.she.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.xvb.MaterialButtonToggleGroup_singleSelection
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setSingleSelection((boolean) r0)
            int r0 = defpackage.xvb.MaterialButtonToggleGroup_checkedButton
            r1 = -1
            int r0 = r8.getResourceId(r0, r1)
            r6.A0 = r0
            int r0 = defpackage.xvb.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r0, r7)
            r6.z0 = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r0 = defpackage.xvb.MaterialButtonToggleGroup_android_enabled
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setEnabled(r0)
            r8.recycle()
            java.util.WeakHashMap r8 = defpackage.eaf.a
            r6.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = eaf.a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    layoutParams2.setMarginEnd(0);
                    layoutParams2.setMarginStart(-min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    layoutParams2.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams2);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            b(materialButton.getId(), materialButton.G0);
            ead shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.a.add(new aw7(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
            materialButton.setEnabled(isEnabled());
            eaf.j(materialButton, new cq0(2, this));
        }
    }

    public final void b(int i, boolean z) {
        if (i != -1) {
            HashSet hashSet = new HashSet(this.B0);
            if (z && !hashSet.contains(Integer.valueOf(i))) {
                if (this.y0 && !hashSet.isEmpty()) {
                    hashSet.clear();
                }
                hashSet.add(Integer.valueOf(i));
            } else if (!z && hashSet.contains(Integer.valueOf(i))) {
                if (!this.z0 || hashSet.size() > 1) {
                    hashSet.remove(Integer.valueOf(i));
                }
            } else {
                return;
            }
            d(hashSet);
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.B0;
        this.B0 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.x0 = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.x0 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.o);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.w0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        aw7 aw7;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                buf e = materialButton.getShapeAppearanceModel().e();
                aw7 aw72 = (aw7) this.a.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    a0 a0Var = aw7.e;
                    if (i == firstVisibleChildIndex) {
                        aw7 = z ? gwf.z(this) ? new aw7(a0Var, a0Var, aw72.b, aw72.c) : new aw7(aw72.a, aw72.d, a0Var, a0Var) : new aw7(aw72.a, a0Var, aw72.b, a0Var);
                    } else if (i == lastVisibleChildIndex) {
                        aw7 = z ? gwf.z(this) ? new aw7(aw72.a, aw72.d, a0Var, a0Var) : new aw7(a0Var, a0Var, aw72.b, aw72.c) : new aw7(a0Var, aw72.d, a0Var, aw72.c);
                    } else {
                        aw72 = null;
                    }
                    aw72 = aw7;
                }
                if (aw72 == null) {
                    e.e = new a0(0.0f);
                    e.f = new a0(0.0f);
                    e.g = new a0(0.0f);
                    e.h = new a0(0.0f);
                } else {
                    e.e = aw72.a;
                    e.h = aw72.d;
                    e.f = aw72.b;
                    e.g = aw72.c;
                }
                materialButton.setShapeAppearanceModel(e.c());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.y0 || this.B0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.B0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.B0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.w0;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A0;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x3a.D(1, getVisibleButtonCount(), this.y0 ? 1 : 2).b);
    }

    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((xv7) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.a.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.z0 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.y0 != z) {
            this.y0 = z;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.y0 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
