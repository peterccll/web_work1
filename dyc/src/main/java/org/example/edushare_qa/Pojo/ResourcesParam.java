package org.example.edushare_qa.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourcesParam {
    private String title;
    private String description;
    private String file_url;
    private String file_type;
    private long uploader_id;
    private long download_count;
    private LocalDateTime  created_at;
}
