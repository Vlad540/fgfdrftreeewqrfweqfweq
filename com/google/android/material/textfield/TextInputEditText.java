package com.google.android.material.textfield;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import java.util.Locale;
import me.leolin.shortcutbadger.BuildConfig;

public class TextInputEditText extends AppCompatEditText {
    public final Rect x0 = new Rect();
    public boolean y0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputEditText(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r6 = defpackage.wlb.editTextStyle
            r7 = 0
            android.content.Context r0 = defpackage.tw7.a(r11, r12, r6, r7)
            r10.<init>(r0, r12, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.x0 = r0
            int[] r8 = defpackage.xvb.TextInputEditText
            int r9 = defpackage.kvb.Widget_Design_TextInputEditText
            int[] r5 = new int[r7]
            defpackage.she.a(r11, r12, r6, r9)
            r0 = r11
            r1 = r12
            r2 = r8
            r3 = r6
            r4 = r9
            defpackage.she.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r8, r6, r9)
            int r12 = defpackage.xvb.TextInputEditText_textInputLayoutFocusedRectEnabled
            boolean r12 = r11.getBoolean(r12, r7)
            r10.setTextInputLayoutFocusedRectEnabled(r12)
            r11.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputEditText.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.y0 && rect != null) {
            Rect rect2 = this.x0;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.y0) {
            return super.getGlobalVisibleRect(rect, point);
        }
        boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
        if (globalVisibleRect && point != null) {
            point.offset(-getScrollX(), -getScrollY());
        }
        return globalVisibleRect;
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.W0) ? super.getHint() : textInputLayout.getHint();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.W0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.FLAVOR).equals("meizu")) {
                setHint(BuildConfig.FLAVOR);
            }
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.y0 || rect == null) {
            return super.requestRectangleOnScreen(rect);
        }
        int height = textInputLayout.getHeight() - getHeight();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom + height;
        Rect rect2 = this.x0;
        rect2.set(i, i2, i3, i4);
        return super.requestRectangleOnScreen(rect2);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.y0 = z;
    }
}
