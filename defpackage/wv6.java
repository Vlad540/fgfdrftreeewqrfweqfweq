package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* renamed from: wv6  reason: default package */
public final class wv6 extends View.AccessibilityDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wv6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((xv6) this.b).h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
        }
    }

    public void sendAccessibilityEvent(View view, int i) {
        Object value;
        switch (this.a) {
            case 1:
                if (i == 8192) {
                    jq8 jq8 = (jq8) this.b;
                    grd grd = jq8.P0;
                    do {
                        value = grd.getValue();
                        ((Number) value).intValue();
                    } while (!grd.b(value, Integer.valueOf(jq8.c.getSelectionEnd())));
                    return;
                }
                return;
            default:
                super.sendAccessibilityEvent(view, i);
                return;
        }
    }
}
