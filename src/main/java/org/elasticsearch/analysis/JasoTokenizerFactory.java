package org.elasticsearch.analysis;

import org.apache.lucene.analysis.Tokenizer;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.analysis.AbstractTokenizerFactory;
import org.elasticsearch.index.settings.IndexSettings;

import java.io.Reader;

/**
 * 자소 토크나이저 팩토리 구현
 * @author	최일규
 * @since	2013-09-15
 */
public class JasoTokenizerFactory extends AbstractTokenizerFactory {

    @Inject
    public JasoTokenizerFactory(Index index, 
    		@IndexSettings Settings indexSettings, 
    		@Assisted String name, 
    		@Assisted Settings settings) {
    	
        super(index, indexSettings, name, settings);
    }

	public Tokenizer create(Reader reader) {
		return new JasoTokenizer(reader);
	}
}
