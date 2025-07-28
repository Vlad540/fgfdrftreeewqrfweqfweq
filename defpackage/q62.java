package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.fresco.middleware.HasExtraData;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.android.join.JoinChatWidget;
import one.me.chats.picker.PickerChatController;
import one.me.chatscreen.ChatScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* renamed from: q62  reason: default package */
public final /* synthetic */ class q62 implements i34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ q62(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                return new ChatScreen(this.b);
            case 1:
                return new ChatScreen(this.b);
            case 2:
                return new ExternalCallbackWidget(x87.G0("params", this.b));
            case 3:
                return new FolderEditScreen(x87.G0(HasExtraData.KEY_ID, this.b));
            case 4:
                return new FolderEditScreen(x87.G0(HasExtraData.KEY_ID, this.b));
            case 5:
                Bundle bundle = this.b;
                return new JoinChatWidget(x87.E0(HasExtraData.KEY_ID, bundle), x87.G0("link", bundle), bundle.getString("title"), x87.B0("channel", bundle));
            case 6:
                Parcelable parcelable = this.b.getParcelable("link");
                if (parcelable != null) {
                    return new LinkInterceptorWidget((Uri) parcelable, (ne7) null, 2, (x54) null);
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 7:
                return new PickerChatController(this.b);
            case 8:
                return new ShareDataPickerScreen(this.b);
            case 9:
                return new StickersSearchScreen(this.b);
            default:
                return new StickersShowcaseScreen(this.b);
        }
    }
}
