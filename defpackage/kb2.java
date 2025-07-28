package defpackage;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* renamed from: kb2  reason: default package */
public final class kb2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaDownloadBottomSheet Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kb2(Continuation continuation, ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet) {
        super(2, continuation);
        this.Y = chatMediaDownloadBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kb2) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kb2 kb2 = new kb2(continuation, this.Y);
        kb2.X = obj;
        return kb2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        gk4 gk4 = (gk4) this.X;
        boolean z = gk4 instanceof fk4;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.Y;
        if (z) {
            chatMediaDownloadBottomSheet.r0(false);
            fk4 fk4 = (fk4) gk4;
            Uri uri = fk4.a;
            ak4 ak4 = fk4.b;
            switch (ak4.ordinal()) {
                case 0:
                    if (uri != null) {
                        String str = oyb.g;
                        oyb.Q(chatMediaDownloadBottomSheet.getContext(), uri, "video/*");
                        break;
                    }
                    break;
                case 1:
                    chatMediaDownloadBottomSheet.z0(otb.media_share_dialog_download_video_success, phc.n);
                    break;
                case 2:
                case 4:
                    if (uri != null) {
                        String str2 = oyb.g;
                        oyb.Q(chatMediaDownloadBottomSheet.getContext(), uri, "image/*");
                        break;
                    }
                    break;
                case 3:
                case 5:
                    chatMediaDownloadBottomSheet.z0(ak4 == ak4.Z ? otb.media_share_dialog_download_gif_success : otb.media_share_dialog_download_photo_success, phc.n);
                    break;
                case 6:
                    if (uri != null) {
                        String str3 = oyb.g;
                        oyb.Q(chatMediaDownloadBottomSheet.getContext(), uri, "*/*");
                        break;
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (gk4 instanceof ek4) {
            int i = ((ek4) gk4).a;
            int i2 = phc.J;
            k77[] k77Arr = ChatMediaDownloadBottomSheet.I0;
            chatMediaDownloadBottomSheet.z0(i, i2);
            chatMediaDownloadBottomSheet.r0(true);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        od4 od4 = chatMediaDownloadBottomSheet.F0;
        if (od4 != null) {
            od4.a();
        }
        return jue.a;
    }
}
