export class Cryptocurrency {

    id: number;
    symbol: string;
    name: string;
    hashingAlgorithm: string;
    categories: string; 
    description: string;
    links: string;
    image: string;
    programmingLanguageImplementation: string;
    releaseYear: number;

    constructor(id: number, symbol: string, name: string, hashingAlgorithm: string, categories: string, description: string, links: string,
                image: string, programmingLanguageImplementation: string, releaseYear: number) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.hashingAlgorithm = hashingAlgorithm;
        this.categories = categories;
        this.description = description;
        this.links = links;
        this.image = image;
        this.programmingLanguageImplementation = programmingLanguageImplementation;
        this.releaseYear = releaseYear;
    }
 }