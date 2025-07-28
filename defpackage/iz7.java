package defpackage;

import android.view.View;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;

/* renamed from: iz7  reason: default package */
public final /* synthetic */ class iz7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarPermissionWidget b;

    public /* synthetic */ iz7(MediaBarPermissionWidget mediaBarPermissionWidget, int i) {
        this.a = i;
        this.b = mediaBarPermissionWidget;
    }

    public final void onClick(View view) {
        MediaBarPermissionWidget mediaBarPermissionWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.l0();
                return;
            case 1:
                k77[] k77Arr2 = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.l0();
                return;
            default:
                k77[] k77Arr3 = MediaBarPermissionWidget.Z;
                mediaBarPermissionWidget.l0();
                return;
        }
    }
}
