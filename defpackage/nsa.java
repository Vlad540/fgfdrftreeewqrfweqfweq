package defpackage;

import one.me.chats.picker.PickerChatsListWidget;

/* renamed from: nsa  reason: default package */
public final /* synthetic */ class nsa extends x26 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nsa(PickerChatsListWidget pickerChatsListWidget, int i) {
        super(1, e07.class, "isChatItem", "configureChatsList$lambda$9$isChatItem(Lone/me/chats/picker/PickerChatsListWidget;I)Z", 0);
        this.a = i;
        switch (i) {
            case 1:
                this.b = pickerChatsListWidget;
                super(1, e07.class, "isChatItem", "configureChatsList$lambda$9$isChatItem(Lone/me/chats/picker/PickerChatsListWidget;I)Z", 0);
                return;
            default:
                this.b = pickerChatsListWidget;
                return;
        }
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(PickerChatsListWidget.l0(this.b, ((Number) obj).intValue()));
            default:
                return Boolean.valueOf(PickerChatsListWidget.l0(this.b, ((Number) obj).intValue()));
        }
    }
}
