package defpackage;

/* renamed from: wt  reason: default package */
public final class wt extends kh0 {
    public final /* synthetic */ int b;

    public /* synthetic */ wt(int i) {
        this.b = i;
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return "AssetsUpdateEvent{chatId=0}";
            case 1:
                return "AudioRecordLimitEvent{}";
            case 3:
                return "ContactSortEvent";
            case 10:
                return "PhonesSortEvent";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt(long j, int i) {
        super(j);
        this.b = i;
    }
}
