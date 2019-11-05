package patterns.clone.comparison;

import patterns.clone.comparison.util.SerializableClone;

import java.io.Serializable;

@SuppressWarnings("unused")
public class DictionarySerializable implements Serializable {
	private String language;
	private final int size;
	private String[] words;

	public DictionarySerializable(String language, int size) {
		this.language = language;
		this.size = size;
		this.words = new String[size];
		for (int i = 0; i < size; i++)
			this.words[i] = "sample word " + i;
	}

	@Override
	public DictionarySerializable clone() {
		return (DictionarySerializable) SerializableClone.clone(this);
	}
}
