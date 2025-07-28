package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;

/* renamed from: xq3  reason: default package */
public final class xq3 extends TextView implements mhe {
    public final /* synthetic */ ContextMenuPopupWindow a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xq3(mge mge, ContextMenuPopupWindow contextMenuPopupWindow, Context context) {
        super(context);
        this.a = contextMenuPopupWindow;
        nte.k.b(this, yq4.b);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setText(mge.a(getContext()));
        onThemeChanged(ContextMenuPopupWindow.l0(contextMenuPopupWindow));
    }

    public final void onThemeChanged(pda pda) {
        setTextColor(ContextMenuPopupWindow.l0(this.a).getText().g);
    }
}
