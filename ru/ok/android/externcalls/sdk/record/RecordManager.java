package ru.ok.android.externcalls.sdk.record;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002\u001c\u001dJA\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJA\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\f2\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H&¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager;", "", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "params", "Lkotlin/Function0;", "Ljue;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lw2d;", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "StartParams", "StopParams", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface RecordManager {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0019\u0018\u00002\u00020\u0001:\u0001\"BU\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b \u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b!\u0010\u0018¨\u0006#"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "", "", "isStream", "", "movieId", "", "albumId", "Lw2d;", "sessionRoomId", "", "name", "description", "groupId", "privacy", "<init>", "(ZLjava/lang/Long;Ljava/lang/String;Lw2d;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/Long;Ljava/lang/String;)V", "Z", "()Z", "Ljava/lang/Long;", "getMovieId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getAlbumId", "()Ljava/lang/String;", "Lw2d;", "getSessionRoomId", "()Lw2d;", "Ljava/lang/CharSequence;", "getName", "()Ljava/lang/CharSequence;", "getDescription", "getGroupId", "getPrivacy", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class StartParams {
        private final String albumId;
        private final CharSequence description;
        private final Long groupId;
        private final boolean isStream;
        private final Long movieId;
        private final CharSequence name;
        private final String privacy;
        private final w2d sessionRoomId;

        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010$R\u001c\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\f\n\u0004\b\u0018\u0010$\u0012\u0004\b%\u0010\u0003¨\u0006&"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "<init>", "()V", "", "movieId", "withMovieId", "(Ljava/lang/Long;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "isStream", "(Z)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "Lw2d;", "sessionRoomId", "withSessionRoomId", "(Lw2d;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "", "name", "withName", "(Ljava/lang/CharSequence;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "description", "withDescription", "groupId", "withGroupId", "", "privacy", "withPrivacy", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams$Builder;", "albumId", "withAlbumId", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "build", "()Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Z", "Ljava/lang/Long;", "Lw2d;", "Ljava/lang/CharSequence;", "Ljava/lang/String;", "getPrivacy$annotations", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
        public static final class Builder {
            private String albumId;
            private CharSequence description = "";
            private Long groupId;
            private boolean isStream;
            private Long movieId;
            private CharSequence name;
            private String privacy = "PUBLIC";
            private w2d sessionRoomId;

            private static /* synthetic */ void getPrivacy$annotations() {
            }

            public final StartParams build() {
                boolean z = this.isStream;
                Long l = this.movieId;
                w2d w2d = this.sessionRoomId;
                CharSequence charSequence = this.name;
                CharSequence charSequence2 = this.description;
                String str = this.privacy;
                return new StartParams(z, l, this.albumId, w2d, charSequence, charSequence2, this.groupId, str, (x54) null);
            }

            public final Builder isStream(boolean z) {
                this.isStream = z;
                return this;
            }

            public final Builder withAlbumId(String str) {
                this.albumId = str;
                return this;
            }

            public final Builder withDescription(CharSequence charSequence) {
                this.description = charSequence;
                return this;
            }

            public final Builder withGroupId(Long l) {
                this.groupId = l;
                return this;
            }

            public final Builder withMovieId(Long l) {
                this.movieId = l;
                return this;
            }

            public final Builder withName(CharSequence charSequence) {
                this.name = charSequence;
                return this;
            }

            public final Builder withPrivacy(String str) {
                this.privacy = str;
                return this;
            }

            public final Builder withSessionRoomId(w2d w2d) {
                this.sessionRoomId = w2d;
                return this;
            }
        }

        public /* synthetic */ StartParams(boolean z, Long l, String str, w2d w2d, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2, x54 x54) {
            this(z, l, str, w2d, charSequence, charSequence2, l2, str2);
        }

        public final String getAlbumId() {
            return this.albumId;
        }

        public final CharSequence getDescription() {
            return this.description;
        }

        public final Long getGroupId() {
            return this.groupId;
        }

        public final Long getMovieId() {
            return this.movieId;
        }

        public final CharSequence getName() {
            return this.name;
        }

        public final String getPrivacy() {
            return this.privacy;
        }

        public final w2d getSessionRoomId() {
            return this.sessionRoomId;
        }

        public final boolean isStream() {
            return this.isStream;
        }

        private StartParams(boolean z, Long l, String str, w2d w2d, CharSequence charSequence, CharSequence charSequence2, Long l2, String str2) {
            this.isStream = z;
            this.movieId = l;
            this.albumId = str;
            this.sessionRoomId = w2d;
            this.name = charSequence;
            this.description = charSequence2;
            this.groupId = l2;
            this.privacy = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "", "Lw2d;", "sessionRoomId", "", "removeRecord", "<init>", "(Lw2d;Z)V", "Lw2d;", "getSessionRoomId", "()Lw2d;", "Z", "getRemoveRecord", "()Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class StopParams {
        private final boolean removeRecord;
        private final w2d sessionRoomId;

        public StopParams() {
            this((w2d) null, false, 3, (x54) null);
        }

        public final boolean getRemoveRecord() {
            return this.removeRecord;
        }

        public final w2d getSessionRoomId() {
            return this.sessionRoomId;
        }

        public StopParams(w2d w2d, boolean z) {
            this.sessionRoomId = w2d;
            this.removeRecord = z;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StopParams(w2d w2d, boolean z, int i, x54 x54) {
            this((i & 1) != 0 ? null : w2d, (i & 2) != 0 ? false : z);
        }
    }

    static /* synthetic */ void startRecord$default(RecordManager recordManager, StartParams startParams, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                s16 = null;
            }
            if ((i & 4) != 0) {
                u16 = null;
            }
            recordManager.startRecord(startParams, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRecord");
    }

    static /* synthetic */ void stopRecord$default(RecordManager recordManager, StopParams stopParams, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                s16 = null;
            }
            if ((i & 4) != 0) {
                u16 = null;
            }
            recordManager.stopRecord(stopParams, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecord");
    }

    void addRecordListener(RecordEventListener recordEventListener);

    RecordDescription getRecordDescription();

    Map<w2d, RecordDescriptionHistory> getRecordDescriptionHistory();

    void removeRecordListener(RecordEventListener recordEventListener);

    void startRecord(StartParams startParams, s16 s16, u16 u16);

    void stopRecord(StopParams stopParams, s16 s16, u16 u16);
}
