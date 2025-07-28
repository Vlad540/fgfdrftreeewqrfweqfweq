package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: e19  reason: default package */
public final class e19 extends l5e implements i26 {
    public MessageModel X;
    public boolean Y;
    public int Z;
    public final /* synthetic */ MessagesListWidget w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ View y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e19(MessagesListWidget messagesListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.w0 = messagesListWidget;
        this.x0 = j;
        this.y0 = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new e19(this.w0, this.x0, this.y0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            pu3 r2 = pu3.a
            int r3 = r10.Z
            r4 = 0
            long r5 = r10.x0
            one.me.messages.list.ui.MessagesListWidget r7 = r10.w0
            if (r3 == 0) goto L_0x0020
            if (r3 != r1) goto L_0x0018
            boolean r2 = r10.Y
            one.me.messages.list.loader.MessageModel r3 = r10.X
            wx3.H(r11)
            goto L_0x0083
        L_0x0018:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0020:
            wx3.H(r11)
            k77[] r11 = one.me.messages.list.ui.MessagesListWidget.b1
            zz8 r11 = r7.t0()
            t0c r11 = r11.t1
            zqd r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            tw8 r11 = (defpackage.tw8) r11
            one.me.messages.list.loader.MessageModel r3 = r11.e(r5)
            k0c r11 = r7.p0()
            ru.ok.onechat.reactions.ReactionsViewModel r11 = r11.q()
            if (r3 == 0) goto L_0x0044
            bp8 r8 = r3.H0
            goto L_0x0045
        L_0x0044:
            r8 = r4
        L_0x0045:
            if (r8 == 0) goto L_0x0058
            r11.getClass()
            bp8 r9 = defpackage.bp8.ERROR
            if (r8 == r9) goto L_0x0058
            bp8 r9 = defpackage.bp8.SENDING
            if (r8 == r9) goto L_0x0058
            bp8 r9 = defpackage.bp8.UNKNOWN
            if (r8 == r9) goto L_0x0058
            r8 = r1
            goto L_0x0059
        L_0x0058:
            r8 = r0
        L_0x0059:
            boolean r9 = r11.k()
            if (r9 == 0) goto L_0x006f
            r7e r11 = r11.n
            java.lang.Object r11 = r11.getValue()
            pyb r11 = (defpackage.pyb) r11
            pyb r9 = defpackage.pyb.c
            if (r11 != r9) goto L_0x006f
            if (r8 == 0) goto L_0x006f
            r11 = r1
            goto L_0x0070
        L_0x006f:
            r11 = r0
        L_0x0070:
            zz8 r8 = r7.t0()
            r10.X = r3
            r10.Y = r11
            r10.Z = r1
            java.lang.Object r8 = r8.x(r5, r10)
            if (r8 != r2) goto L_0x0081
            return r2
        L_0x0081:
            r2 = r11
            r11 = r8
        L_0x0083:
            r8 = r11
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x008d
            r4 = r11
        L_0x008d:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x00fc
            long[] r11 = new long[r1]
            r11[r0] = r5
            k77[] r8 = one.me.messages.list.ui.MessagesListWidget.b1
            r7.getClass()
            k77[] r8 = one.me.messages.list.ui.MessagesListWidget.b1
            r1 = r8[r1]
            jr r1 = r7.c
            r1.b(r7, r11)
            lo8 r11 = new lo8
            r11.<init>()
            android.os.Bundle r1 = r11.a
            java.lang.String r8 = "show_reactions_selector"
            r1.putBoolean(r8, r2)
            java.lang.String r2 = "message_id"
            r1.putLong(r2, r5)
            if (r3 == 0) goto L_0x00b9
            long r2 = r3.b
            goto L_0x00bb
        L_0x00b9:
            r2 = 0
        L_0x00bb:
            java.lang.String r5 = "message_server_id"
            r1.putLong(r5, r2)
            android.os.Bundle r2 = r7.getArgs()
            java.lang.String r3 = "ARG_CHAT_ID"
            long r2 = r2.getLong(r3)
            java.lang.String r5 = "chat_id"
            r1.putLong(r5, r2)
            inc r2 = new inc
            java.lang.String r3 = r7.b
            r2.<init>(r3)
            java.lang.String r3 = "arg_key_scope_id"
            r1.putParcelable(r3, r2)
            r11.e(r4)
            android.view.View r10 = r10.y0
            r11.j(r10)
            android.graphics.Rect r10 = new android.graphics.Rect
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r10.<init>(r1, r0, r1, r0)
            r0 = 0
            r11.c(r10, r0)
            int r10 = defpackage.opb.messages_list_recycler_view
            r11.l(r10)
            nq3 r10 = r11.build()
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r10 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r10
            r10.q(r7)
        L_0x00fc:
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e19.o(java.lang.Object):java.lang.Object");
    }
}
