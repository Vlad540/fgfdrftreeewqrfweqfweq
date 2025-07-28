package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: cx2  reason: default package */
public final class cx2 extends k55 {
    public final /* synthetic */ Chip q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cx2(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    public final int n(float f, float f2) {
        int i = Chip.P0;
        Chip chip = this.q;
        return (!chip.e() || !chip.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
    }

    public final void o(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        int i = Chip.P0;
        Chip chip = this.q;
        if (chip.e()) {
            ex2 ex2 = chip.w0;
            if (ex2 != null && ex2.a1) {
                z = true;
            }
            if (z && chip.z0 != null) {
                arrayList.add(1);
            }
        }
    }

    public final boolean s(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.z0;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.L0) {
                    chip.K0.x(1, 1);
                }
            }
        }
        return z;
    }

    public final void t(l4 l4Var) {
        Chip chip = this.q;
        boolean f = chip.f();
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        accessibilityNodeInfo.setCheckable(f);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        l4Var.h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    public final void u(int i, l4 l4Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = l4Var.a;
        CharSequence charSequence = BuildConfig.FLAVOR;
        if (i == 1) {
            Chip chip = this.q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                int i2 = wsb.mtrl_chip_close_icon_content_description;
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(i2, new Object[]{charSequence}).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            l4Var.b(g4.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.Q0);
    }

    public final void v(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.q;
            chip.F0 = z;
            chip.refreshDrawableState();
        }
    }
}
