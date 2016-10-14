# Twitter Location Parser

A fork of https://github.com/smallrivers/twitter-location-parser with
a Clojure friendly API and support for latitude/longitude retrieval.

It has a simplistic API and also a ready to
use [component](https://github.com/stuartsierra/component).

``` clojure
(use 'qbits.tlp)
(def p (load-parser))
(find-location p "paris")

=>
{:name "Paris",
 :alternate-names
 "Baariis,Bahliz,Gorad Paryzh,Lungsod ng Paris,Lutece,Lutetia,Lutetia Parisorum,Lutèce,PAR,Pa-ri,Paarys,Palika,Paname,Pantruche,Paraeis,Paras,Pari,Paries,Parigge,Pariggi,Parighji,Parigi,Pariis,Pariisi,Pariizu,Pariižu,Parij,Parijs,Paris,Parisi,Parixe,Pariz,Parize,Parizh,Parizh osh,Parizh',Parizo,Parizs,Pariž,Parys,Paryz,Paryzius,Paryż,Paryžius,Paräis,París,Paríž,Parîs,Parĩ,Parī,Parīze,Paříž,Páras,Párizs,Ville-Lumiere,Ville-Lumière,ba li,barys,pairisa,pali,pari,paris,parys,paryzh,perisa,pryz,pyaris,pyarisa,pyrs,Παρίσι,Горад Парыж,Париж,Париж ош,Парижь,Париз,Парис,Паріж,Փարիզ,פאריז,פריז,باريس,پارىژ,پاريس,پاریس,پیرس,ܦܐܪܝܣ,पॅरिस,पेरिस,पैरिस,প্যারিস,ਪੈਰਿਸ,પૅરિસ,பாரிஸ்,పారిస్,ಪ್ಯಾರಿಸ್,പാരിസ്,ปารีส,ཕ་རི།,ပါရီမြို့,პარიზი,ፓሪስ,ប៉ារីស,パリ,巴黎,파리",
 :state-code "11",
 :country-code "FR",
 :type :city,
 :population 2138551,
 :latitude 48.85341,
 :longitude 2.3488}

```


The component is in `qbits.tlp.component`, it uses the same api, you
just call `qbits.tlp/find-location` on it once it's started to get a
match.

## Installation

add this to your `project.clj`

``` clojure
[cc.qbits/tlp "1.0.1"]
```
and you're good to go
