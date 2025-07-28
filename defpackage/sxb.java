package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: sxb  reason: default package */
public final class sxb extends LinearLayout {
    public qxb a;
    public int b;
    public List c;

    private final void setDataList(List<rxb> list) {
        int size = list.size();
        int i = this.b;
        if (size > i) {
            this.c = o23.n0(list, i);
            a();
            String name = sxb.class.getName();
            int size2 = list.size();
            udd.s(name, "Buttons count out of limit. Size -> " + size2, (Throwable) null);
            return;
        }
        this.c = list;
        a();
    }

    private final void setMaxButtonsCount(int i) {
        if (i >= 1) {
            this.b = i;
            requestLayout();
        }
    }

    public final void a() {
        int i;
        if (getChildCount() < this.c.size()) {
            int size = this.c.size() - getChildCount();
            for (int i2 = 0; i2 < size; i2++) {
                pxb pxb = new pxb(getContext());
                pxb.setId(View.generateViewId());
                addView(pxb);
            }
        }
        int i3 = 0;
        while (true) {
            if (i3 < getChildCount()) {
                int i4 = i3 + 1;
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    childAt.setVisibility(8);
                    i3 = i4;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                int i5 = 0;
                for (Object next : this.c) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        rxb rxb = (rxb) next;
                        pxb pxb2 = (pxb) getChildAt(i5);
                        pxb2.setId(rxb.a);
                        pxb2.setVisibility(0);
                        oxb oxb = rxb.b;
                        pxb2.setSize(oxb);
                        pxb2.setEnabled(rxb.d);
                        pxb2.setText(rxb.c);
                        a24.Z(pxb2, 300, new xv5(this, 22, rxb));
                        ViewGroup.LayoutParams layoutParams = pxb2.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (i5 != 0) {
                                int ordinal = oxb.ordinal();
                                if (ordinal == 0) {
                                    i = a24.X(((float) 40) * dh4.c().getDisplayMetrics().density);
                                } else if (ordinal == 1) {
                                    i = a24.X(((float) 24) * dh4.c().getDisplayMetrics().density);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                                marginLayoutParams.setMarginStart(i);
                                pxb2.setLayoutParams(marginLayoutParams);
                            }
                            i5 = i6;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    } else {
                        p23.G();
                        throw null;
                    }
                }
                return;
            }
        }
    }

    public final void setButtonToolDataList(List<rxb> list) {
        setDataList(list);
    }

    public final void setListener(qxb qxb) {
        this.a = qxb;
    }
}
