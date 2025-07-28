package one.me.messages.list.loader;

import android.text.Layout;
import androidx.annotation.Keep;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lone/me/messages/list/loader/MessageModel;", "Lrg6;", "Lpg7;", "fr8", "er8", "Companion", "message-list_release"}, k = 1, mv = {2, 0, 0})
public final class MessageModel implements rg6, pg7 {
    public static final Companion M0 = new Object();
    public final qs8 A0;
    public final tq8 B0;
    public final fr8 C0;
    public final int D0;
    public final yr8 E0;
    public final long F0;
    public final boolean G0;
    public final bp8 H0;
    public Layout I0;
    public Layout J0;
    public er8 K0;
    public int L0;
    public final CharSequence X;
    public final CharSequence Y;
    public final dcf Z;
    public final long a;
    public final long b;
    public final long c;
    public final CharSequence o;
    public final boolean w0;
    public final boolean x0;
    public final wy y0;
    public final boolean z0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/messages/list/loader/MessageModel$Companion;", "", "", "displayText", "", "pinId", "Lone/me/messages/list/loader/MessageModel;", "control", "(Ljava/lang/CharSequence;J)Lone/me/messages/list/loader/MessageModel;", "message-list_release"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        @Keep
        public final MessageModel control(CharSequence charSequence, long j) {
            wy wyVar = wy.f;
            bp8 bp8 = bp8.SENT;
            fr8 fr8 = r0;
            fr8 fr82 = new fr8(j);
            return new MessageModel(0, 0, 0, charSequence, "", "", dcf.None, false, false, wyVar, false, (qs8) null, (tq8) null, fr8, 2, (yr8) null, 0, true, bp8, (er8) null, 3152896);
        }
    }

    public MessageModel(long j, long j2, long j3, CharSequence charSequence, String str, CharSequence charSequence2, dcf dcf, boolean z, boolean z2, wy wyVar, boolean z3, qs8 qs8, tq8 tq8, fr8 fr8, int i, yr8 yr8, long j4, boolean z4, bp8 bp8, er8 er8, int i2) {
        int i3 = i2;
        int i4 = 0;
        boolean z5 = (i3 & 1024) != 0 ? false : z3;
        qs8 qs82 = (i3 & 2048) != 0 ? null : qs8;
        tq8 tq82 = (i3 & 4096) != 0 ? null : tq8;
        fr8 fr82 = (i3 & 8192) != 0 ? null : fr8;
        er8 er82 = (2097152 & i3) != 0 ? null : er8;
        i4 = (i3 & 4194304) != 0 ? -1 : i4;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = charSequence;
        this.X = str;
        this.Y = charSequence2;
        this.Z = dcf;
        this.w0 = z;
        this.x0 = z2;
        this.y0 = wyVar;
        this.z0 = z5;
        this.A0 = qs82;
        this.B0 = tq82;
        this.C0 = fr82;
        this.D0 = i;
        this.E0 = yr8;
        this.F0 = j4;
        this.G0 = z4;
        this.H0 = bp8;
        this.I0 = null;
        this.J0 = null;
        this.K0 = er82;
        this.L0 = i4;
    }

    @Keep
    public static final MessageModel control(CharSequence charSequence, long j) {
        return M0.control(charSequence, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageModel)) {
            return false;
        }
        MessageModel messageModel = (MessageModel) obj;
        return this.a == messageModel.a && this.b == messageModel.b && this.c == messageModel.c && hhd.f(this.o, messageModel.o) && hhd.f(this.X, messageModel.X) && hhd.f(this.Y, messageModel.Y) && this.Z == messageModel.Z && this.w0 == messageModel.w0 && this.x0 == messageModel.x0 && hhd.f(this.y0, messageModel.y0) && this.z0 == messageModel.z0 && hhd.f(this.A0, messageModel.A0) && hhd.f(this.B0, messageModel.B0) && hhd.f(this.C0, messageModel.C0) && this.D0 == messageModel.D0 && hhd.f(this.E0, messageModel.E0) && this.F0 == messageModel.F0 && this.G0 == messageModel.G0 && this.H0 == messageModel.H0 && hhd.f(this.I0, messageModel.I0) && hhd.f(this.J0, messageModel.J0) && hhd.f(this.K0, messageModel.K0) && ht8.a(this.L0, messageModel.L0);
    }

    public final boolean g(pg7 pg7) {
        return this.a == pg7.getItemId();
    }

    public final long getId() {
        return this.a;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int f = th2.f((this.y0.hashCode() + th2.f(th2.f((this.Z.hashCode() + me4.f(this.Y, me4.f(this.X, me4.f(this.o, sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31)) * 31, 31, this.w0), 31, this.x0)) * 31, 31, this.z0);
        int i = 0;
        qs8 qs8 = this.A0;
        int hashCode = (f + (qs8 == null ? 0 : qs8.hashCode())) * 31;
        tq8 tq8 = this.B0;
        int hashCode2 = (hashCode + (tq8 == null ? 0 : tq8.hashCode())) * 31;
        fr8 fr8 = this.C0;
        int h = us8.h(this.D0, (hashCode2 + (fr8 == null ? 0 : Long.hashCode(fr8.a))) * 31, 31);
        yr8 yr8 = this.E0;
        int hashCode3 = (this.H0.hashCode() + th2.f(sxe.m((h + (yr8 == null ? 0 : yr8.hashCode())) * 31, 31, this.F0), 31, this.G0)) * 31;
        Layout layout = this.I0;
        int hashCode4 = (hashCode3 + (layout == null ? 0 : layout.hashCode())) * 31;
        Layout layout2 = this.J0;
        int hashCode5 = (hashCode4 + (layout2 == null ? 0 : layout2.hashCode())) * 31;
        er8 er8 = this.K0;
        if (er8 != null) {
            i = er8.hashCode();
        }
        return Integer.hashCode(this.L0) + ((hashCode5 + i) * 31);
    }

    public final long k() {
        return this.c;
    }

    public final int l() {
        return this.L0;
    }

    public final String m() {
        String e = ht8.e(this.L0);
        return i0e.D("\n        MessageModel(mid=" + this.a + ", sid=" + this.b + " time=" + this.c + " viewType=" + e + ")\n    ");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            pg7 r15 = (defpackage.pg7) r15
            boolean r0 = r15 instanceof one.me.messages.list.loader.MessageModel
            if (r0 != 0) goto L_0x0009
            r14 = 0
            goto L_0x0082
        L_0x0009:
            wy r0 = r14.y0
            vw6 r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001a
            r4 = r15
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            wy r4 = r4.y0
            vw6 r4 = r4.e
            if (r4 != 0) goto L_0x002b
        L_0x001a:
            if (r1 == 0) goto L_0x0028
            r4 = r15
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            wy r4 = r4.y0
            vw6 r4 = r4.e
            boolean r1 = r1.a(r4)
            goto L_0x0029
        L_0x0028:
            r1 = r3
        L_0x0029:
            if (r1 != 0) goto L_0x002d
        L_0x002b:
            r13 = r3
            goto L_0x002e
        L_0x002d:
            r13 = r2
        L_0x002e:
            android.text.Layout r1 = r14.I0
            one.me.messages.list.loader.MessageModel r15 = (one.me.messages.list.loader.MessageModel) r15
            android.text.Layout r4 = r15.I0
            boolean r1 = hhd.f(r1, r4)
            r5 = r1 ^ 1
            android.text.Layout r1 = r14.J0
            android.text.Layout r4 = r15.J0
            boolean r1 = hhd.f(r1, r4)
            r6 = r1 ^ 1
            dcf r1 = r14.Z
            dcf r4 = r15.Z
            if (r1 == r4) goto L_0x004c
            r8 = r3
            goto L_0x004d
        L_0x004c:
            r8 = r2
        L_0x004d:
            java.lang.CharSequence r1 = r14.X
            java.lang.CharSequence r4 = r15.X
            boolean r1 = hhd.f(r1, r4)
            r7 = r1 ^ 1
            qs8 r1 = r14.A0
            qs8 r4 = r15.A0
            boolean r1 = hhd.f(r1, r4)
            r9 = r1 ^ 1
            yr8 r1 = r14.E0
            yr8 r4 = r15.E0
            boolean r1 = hhd.f(r1, r4)
            r10 = r1 ^ 1
            boolean r14 = r14.z0
            boolean r1 = r15.z0
            if (r14 == r1) goto L_0x0073
            r11 = r3
            goto L_0x0074
        L_0x0073:
            r11 = r2
        L_0x0074:
            wy r14 = r15.y0
            boolean r14 = r0.equals(r14)
            r12 = r14 ^ 1
            pr8 r14 = new pr8
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0082:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.loader.MessageModel.n(java.lang.Object):java.lang.Object");
    }

    public final boolean t(Object obj) {
        return equals((pg7) obj);
    }

    public final String toString() {
        Layout layout = this.I0;
        Layout layout2 = this.J0;
        er8 er8 = this.K0;
        String e = ht8.e(this.L0);
        StringBuilder sb = new StringBuilder("MessageModel(messageId=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", sortTime=");
        sb.append(this.c);
        sb.append(", displayText=");
        sb.append(this.o);
        sb.append(", displayTime=");
        sb.append(this.X);
        sb.append(", decorTime=");
        sb.append(this.Y);
        sb.append(", viewStatus=");
        sb.append(this.Z);
        sb.append(", drawBackground=");
        sb.append(this.w0);
        sb.append(", needCorners=");
        sb.append(this.x0);
        sb.append(", attachInfo=");
        sb.append(this.y0);
        sb.append(", isEdit=");
        sb.append(this.z0);
        sb.append(", messageTextStaticLayout=");
        sb.append(this.A0);
        sb.append(", messageLink=");
        sb.append(this.B0);
        sb.append(", controlInfo=");
        sb.append(this.C0);
        sb.append(", chatType=");
        int i = this.D0;
        sb.append(i != 1 ? i != 2 ? "null" : "CHAT" : "DIALOG");
        sb.append(", reactionsData=");
        sb.append(this.E0);
        sb.append(", senderId=");
        sb.append(this.F0);
        sb.append(", isIncoming=");
        sb.append(this.G0);
        sb.append(", deliveryStatus=");
        sb.append(this.H0);
        sb.append(", sender=");
        sb.append(layout);
        sb.append(", alias=");
        sb.append(layout2);
        sb.append(", avatarParams=");
        sb.append(er8);
        sb.append(", messageViewType=");
        return wn6.l(sb, e, ")");
    }
}
