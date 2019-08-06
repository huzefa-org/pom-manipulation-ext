/*
 * Copyright (C) 2012 Red Hat, Inc. (jcasey@redhat.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.commonjava.maven.ext.common.json;

/*
 * Created by JacksonGenerator on 23/07/2019.
 */

import lombok.Getter;
import lombok.Setter;
import org.commonjava.maven.atlas.ident.ref.ProjectVersionRef;

@Getter
@Setter
public class GAV
{
    private String groupId;
    private String artifactId;
    private String version;
    private String originalGAV;

    public void setGAV( ProjectVersionRef p )
    {
        setGroupId( p.getGroupId() );
        setArtifactId( p.getArtifactId() );
        setVersion( p.getVersionString() );
    }
}